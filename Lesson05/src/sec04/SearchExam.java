package sec04;

public class SearchExam {

	public static void main(String[] args) {

		String str = "�ڹ� ���α׷���";
		
		int rs = str.indexOf("���α׷���"); // �ε�����ȣ �Ǵ� -1�� ���� �ϹǷ� int�� �޾ƾ���
		if(rs > -1 ) {
			System.out.println("���α׷��� ����");
		}else {
			System.out.println("������ ���� �ڹٰ��� ����");
		}
	
		 boolean rs2 = str.contains("�ڹ�");
			if(rs2) {
				System.out.println("����");
			}else {
				System.out.println("���α׷��ֵ���");
			}
	}

}
