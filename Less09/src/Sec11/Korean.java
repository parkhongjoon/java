package Sec11;

public class Korean {
	//�ν��Ͻ� final �ʵ�
	final String nation = "���ѹα�";
	final String ssn;
	
	String name;
	
	//������ ����
	public Korean(String ssn) {
		this.ssn = ssn;
	}
	
	void koreanInit (String getName) {
		this.name = getName;
		System.out.println(this.ssn + "-" + this.name);
	}
}
