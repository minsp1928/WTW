package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.DoubleToLongFunction;

import dao.DB;
import dto.MemberDto;

public class LoginDAO implements LoginInfo {

	@Override
	public boolean login(String id, String pw) throws Exception {
		Connection conn = DB.getInstance().getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		MemberDto member = null;
		boolean check = false;
		ArrayList<MemberDto> dto = new ArrayList<>();
		try {
			stmt = conn.createStatement();
			String sql = "SELECT * FROM MEMBER";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				dto.add(new MemberDto(rs.getString("ID"), rs.getString("PW"), rs.getString("NICK"), rs.getInt("AGE"),
						rs.getString("GEN"), rs.getInt("STATUS"), rs.getInt("RE_COUNT")));
			}
			for (int i = 0; i < dto.size(); i++) {
				if (id.equals(dto.get(i).getId())) { 
					if (pw.equals(dto.get(i).getPw())) {
						member = new MemberDto(dto.get(i).getId(), dto.get(i).getPw(), dto.get(i).getNick(),
								dto.get(i).getAge(), dto.get(i).getGen(), dto.get(i).getStatus(),
								dto.get(i).getRe_count());
						check = true;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
			} catch (Exception e) {
			}
		}
		return check;
	}

	@Override
	public int addUser(MemberDto dto) throws Exception {
		Connection conn = DB.getInstance().getConnection();
		PreparedStatement pstmt = null;
		try {
			String sql = "INSERT INTO MEMBER VALUES(?, ?, ?, ?, ?, 0, 0)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			pstmt.setString(3, dto.getNick());
			pstmt.setInt(4, dto.getAge());
			pstmt.setString(5, dto.getGen());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
			}
		}
		return 0;
	}

	@Override
	public MemberDto member(String id) throws Exception {
		Connection conn = DB.getInstance().getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<MemberDto> member = new ArrayList<>();
		try {
			String sql = "SELECT * FROM MEMBER WHERE ID = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				member.add(new MemberDto(rs.getString("ID"), rs.getString("PW"), rs.getString("NICK"), rs.getInt("AGE"),
						rs.getString("GEN"), rs.getInt("STATUS"), rs.getInt("RE_COUNT")));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
			}
		}
		return member.get(0);
	}
}
