package sec05;

public class ArrayCreateEx2 {

	public static void main(String[] args) {

		//�迭 ������ ����
		int[] scores;
		
		//�迭 ������ ����, ����, ���� ������ ����
		scores = new int[] {90, 95, 94};
		
		printScores(new int[]{67, 66, 80});
	}
	
	// printScores ��� �޼ҵ带 ����
	public static void printScores(int[] scores) {
		
		//�Ű������� �����ϴ� �迭�� �׸��� ���
		for(int i = 0; i<3; i++) {
			System.out.println("scores[" + i + "]: " + scores[i]);
		}
	}

}
