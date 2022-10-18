package walk_Board;

import java.sql.Connection;
import java.sql.PreparedStatement;

import dao.DB;
import dto.WalkBoardDto;

public class WalkBoardDAO implements WalkBoardInfo {

	@Override
	public int InsertWalkBoard(WalkBoardDto walkBoard) throws Exception {
		Connection conn = DB.getInstance().getConnection();
		PreparedStatement pstmt = null;
		try {

			String sql = "INSERT INTO WALK_BOARD VALUES(WALK_NUM, ?, ?, ?, ?, ?, ?, 0, NOW());";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, walkBoard.getId());
			pstmt.setString(2, walkBoard.getNick());
			pstmt.setString(3, walkBoard.getTitle());
			pstmt.setString(4, walkBoard.getComment());
			pstmt.setDate(5, walkBoard.getStart_Time());
			pstmt.setString(6, walkBoard.getAddr());
			pstmt.executeUpdate();
		} catch(Exception e) {
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

}
