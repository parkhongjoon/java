package sec05;

public class SplitExam01 {

	public static void main(String[] args) {

		String board = "1,�ڹ� �н�, ���� Ÿ��String�� �����սô�.,��ö��";
		//��ǥ�� �������� ���ڿ��� �и�
		String[] tks = board.split(",");
		//�ε����� �о����
		System.out.println("��ȣ : " + tks[0]);
		System.out.println("���� : " + tks[1]);
		System.out.println("���� : " + tks[2]);
		System.out.println("�̸� : " + tks[3]);
		System.out.println("+++++++++++++");
		System.out.println();
		
		//for���� �̿��Ͽ� ���
		for(int i = 0; i < tks.length; i++) {
			System.out.println(tks[i]);
		}
		
	}

}