package Sec3;

public class ValScopeExam {

	public static void main(String[] args) {
		int v1 = 15;
		if(v1 >10) {
			int v2 = v1 - 10;
		}
		//int v3 = v1 + v2 +5; //v2 ���� ��� �Ұ��� ���� ������ ����
		
		
		//   %s(����)		%d(����) ǥ��
		
		System.out.println("1�� �ؽ�Ʈ");
		System.out.print("2�� �ؽ�Ʈ");
		
		System.out.printf("�̸� : $s", "ȫ �浿");
		System.out.printf("���� : %d", 25);
		
		System.out.printf("�̸� : %s, ���� : %d", "ȫ �浿", 25);
	}

}
