package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.MemberDto;
import member.AddUserController;
import member.LoginController;
import member.LoginDAO;
import member.LoginInfo;
import walk_Board.InsertWalkBoard;
import walk_Board.WalkBoardDAO;

public class WTW {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		LoginInfo info = new LoginDAO();
		LoginController login = new LoginController();
		AddUserController add = new AddUserController();
		InsertWalkBoard walkBoard = new InsertWalkBoard();
		boolean main = true;
		boolean check = false;
		while (main) {
			System.out.println("메뉴를 선택하세요. \\ 1 : 로그인 2 : 회원가입");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.println("ID를 입력하세요.");
				String id = sc.next();
				System.out.println("PW를 입력하세요.");
				String pw = sc.next();
				check = login.login(id, pw);
				if (check == true) {
					
					while (check) {
						System.out.println("|-------------------|");
						System.out.println(" 반갑습니다. WTW 입니다.");
						System.out.println("|-------------------|");
						System.out.println(" 1.마이페이지 2.강아지 정보 3.게시판 4.산책모임 게시판 5.우편함 6.신고하기 7.로그아웃");
						System.out.println("|--------------------------------------------------------------------|");
						int mainList = sc.nextInt();
						switch (mainList) {
						case 1:
							System.out.println("마이페이지 입니다.");
							break;
						case 4:
							System.out.println("산책모임 게시판입니다.");
							
							walkBoard.insertWalkBoard(id);
							break;
						case 7:
							check = false;
						}
					}
				} else {
					System.out.println("ID 및 PW 를 확인해주세요.");
				}
				break;
			case 2:
				add.addUser();
				break;
			}
		}
	}
}
