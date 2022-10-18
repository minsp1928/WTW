package walk_Board;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.MemberDto;
import dto.WalkBoardDto;
import member.LoginDAO;
import member.LoginInfo;

public class InsertWalkBoard {
	
	public void insertWalkBoard(String id) throws Exception{
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat date = new SimpleDateFormat("yyyy년MM월dd일HH시mm분");
		List<MemberDto> dto = new ArrayList<>();
		WalkBoardInfo info = new WalkBoardDAO();
		LoginInfo login = new LoginDAO();
		
		MemberDto member = login.member(id);
		
		String nick = member.getNick();
		
		System.out.println("제목을 입력하세요.");
		String title = sc.next();
		
		System.out.println("본문 내용을 입력하세요.");
		String comment = sc.next();
		
		System.out.println("시작 시간을 입력하세요.");
		System.out.println("년월일시분");
		String start_time = sc.next();
		Date Insertdate = new Date(date.parse(start_time).getTime());
		
		System.out.println("주소를 입력하세요.");
		String addr = sc.next();
		
		WalkBoardDto walkBoard = new WalkBoardDto(id, nick, title, comment, Insertdate, addr);
		info.InsertWalkBoard(walkBoard);
	}

}
