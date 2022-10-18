package member;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import app.WTW;
import dto.MemberDto;
import walk_Board.InsertWalkBoard;

public class LoginController {
	public boolean login(String id, String pw) throws Exception {		
		MessageDigest mdSHA256 = MessageDigest.getInstance("SHA-256");
		Scanner sc = new Scanner(System.in);
		LoginInfo info = new LoginDAO();
		InsertWalkBoard walkBoard = new InsertWalkBoard();
		boolean check = false;
		String securityPw = "";
		
		// 비밀번호 암호화
		mdSHA256.update(pw.getBytes("UTF-8"));
		byte[] sha256hash = mdSHA256.digest();
		StringBuffer hexSHA256hash = new StringBuffer();
		for(byte b : sha256hash) {
			String hexString = String.format("%02x", b);
			hexSHA256hash.append(hexString);
		}
		securityPw = hexSHA256hash.toString();
		check = info.login(id, securityPw);
		return check;
	}
}
