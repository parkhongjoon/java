package sec05;

public class Student {
	//�ʵ� - ��ü�� �����Ͱ� ����Ǵ� ��
	int age;
	String name;
	int grade;
	
	//������ - Ŭ���� ��� ����. ex) Student(){} �Ѵ� ���� / �⺻������ ���� , ��ü ���� �� �ʱ�ȭ ��Ȱ
	Student(int age, String name, int grade) {
		this.age = age; //���� age�� �ް����� ���� this.age�� �ʵ尪 ���� ���� �޾Ƽ� ������ �ʱ�ȭ
		this.name = name; // ���� �ްԺ������� ���ص� ���X �ʵ尪 this�� ����
		this.grade = grade;
	}
	
	//�޼ҵ� - ��ü�� �������� ȣ��� ����Ǵ� ��
	public void study() {
		System.out.println("�����ð����� ���θ� ������ �մϴ�.");
	}
	public void home() {
		System.out.println("������ ������ ���� ���ϴ�.");
	}
}
