package Exam14;

public class MemberExam {

	public static void main(String[] args) {
	Member mem = new Member();
	
	mem.setNum(1);
	mem.setUserName("ȫ�浿");
	mem.setUserEMail("hong@hong.com");
	mem.setGender(false);
	mem.setCount(1000);
	mem.setAddress("������");
	
	System.out.println(mem.getNum());
	System.out.println(mem.getUserName());
	System.out.println(mem.getUserEMail());
	String g;
	if(mem.isGender()) {
		g = "����";
	}else {
		g = "����";
	}
	System.out.println(g);
	System.out.println(mem.getCount());
	}
}