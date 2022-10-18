package member;

import java.security.MessageDigest;
import java.util.Scanner;

import dto.MemberDto;

public class AddUserController {
	
	public void addUser() throws Exception{
		LoginInfo info = new LoginDAO();
		MessageDigest mdSHA256 = MessageDigest.getInstance("SHA-256");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사용하실 ID를 입력하세요.");
		String addId = sc.next();
		
		System.out.println("사용하실 비밀번호를 입력하세요.");
		String addPw = sc.next();
		String securityPw = "";
		
		// 비밀번호 암호화
		mdSHA256.update(addPw.getBytes("UTF-8"));
		byte[] sha256hash = mdSHA256.digest();
		StringBuffer hexSHA256hash = new StringBuffer();
		for(byte b : sha256hash) {
			String hexString = String.format("%02x", b);
			hexSHA256hash.append(hexString);
		}
		securityPw = hexSHA256hash.toString();	
				
		System.out.println("사용하실 이름을 입력하세요.");
		String addName = sc.next();
		
		System.out.println("나이를 입력하세요.");
		int addAge = sc.nextInt();
		
		System.out.println("성별을 입력하세요.");
		String addGen = sc.next();
		
		MemberDto member = new MemberDto(addId, securityPw, addName, addAge, addGen);
		
		info.addUser(member);
		
		System.out.println("회원가입이 완료되었습니다.");
	}
}
