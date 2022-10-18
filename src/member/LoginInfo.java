package member;

import java.util.List;

import dto.MemberDto;

public interface LoginInfo {
	boolean login(String id, String pw) throws Exception;
	int addUser(MemberDto dto) throws Exception;
	MemberDto member(String id) throws Exception;
}
