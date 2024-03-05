package sec06;

public class MemberService {
	
	//필드 없음
	//생성자 기본값
	
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		}else {
			return false;
		}
	}
	
	void logout(String id) {
		System.out.println(id + "로그아웃");
	}
}
