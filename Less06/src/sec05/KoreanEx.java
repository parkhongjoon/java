package sec05;

public class KoreanEx {

	public static void main(String[] args) {

		Korean s1 = new Korean("��ö��","215455-1212121",65);
		Korean s2 = new Korean("�̿���","151214-2122121",45);
		
		System.out.println("���� : " + s1.nation);
		System.out.println(s1.name + ", " + s1.age + "��, " + s1.ssn);
		
		System.out.println("���� : " + s2.nation);
		System.out.println(s2.name + ", " + s2.age + "��, " + s2.ssn);
	}

}
