package sec06;

public class Exam {

	public static void main(String[] args) {
		
		
		//���� A�� ���� charCode�� ��� charCode�� 65~90���̿� ������ "charCode�� �빮�� �Դϴ�." �� ��� �϶�
		
		//char charCode = 'A';
		int charCode = 'A';
		
		if((charCode >= 65) & (charCode <= 90)) {
			System.out.println("�빮�� �Դϴ�.");
		}
				

		//charCode�� 97 �� 122 ���̿� ������ charCode�� �ҹ��� �Դϴ�. �׷��� ������ �ҹ��ڰ� �ƴմϴ�. �� ����϶�
		
		if((charCode >= 97) & (charCode <= 122)) {
			System.out.println("�빮�� �Դϴ�.");
		}else {
			System.out.println("�ҹ��ڰ� �ƴմϴ�.");
		}
				
		//charCode�� 48 �� 57 ���̿� ������ charCode�� ���� �Դϴ�. �׷��� ������ ���ڰ� �ƴմϴ�. �� ����϶�
		
		if((charCode >= 48) & (charCode <= 57)) {
			System.out.println("���� �Դϴ�..");
		}else {
			System.out.println("���ڰ� �ƴմϴ�.");
		}
	}

}
