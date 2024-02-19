package sec07;

public class MultiArrayCreateEx01 {

	public static void main(String[] args) {


		//2���� �迭 ���� = [][]
		int[][] scores = {
				{15, 25, 35},
				{50, 70, 30, 40, 90}
		};
		
		//�迭�� ����
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		
		//ù ��° ���� ����° �л� ������?
		System.out.println(scores[0][2]);
		
		//�� ���� ���� �� ��° �л� ������?
		System.out.println(scores[1][1]);
		
		//ù ��° ���� ��� ������?
		int fclassSum = 0;
		for(int i=0; i<scores[0].length; i++) {
			fclassSum += scores[0][i];
		}
		double fclassAvg = (double) fclassSum / scores[0].length;
		System.out.println(fclassAvg);
		
		//�� ��° ���� ��� ������?
		int sclassSum = 0;
		for(int i=0; i<scores[1].length; i++) {
			sclassSum += scores[1][i];
		}
		double sclassAvg = (double) sclassSum / scores[1].length;
		System.out.println(sclassAvg);
		
		//��ü ��� ������?
		int totalStudent = 0;
		int totalSum = 0;
		for(int i = 0; i<scores.length; i++) {
			totalStudent += scores[i].length;
			for(int j = 0; j<scores[i].length; j++) {
				totalSum += scores[i][j];
			}
		}
		double totalAvg = (double) totalSum / totalStudent;
		System.out.println(totalAvg);
		}


	}

