package sec05;

public class ArrayCreateEx {

	public static void main(String[] args) {

		//�迭 ����� ���ÿ� ����
//		String[] season = {"Spring","Summer","Fall","Winter"};
//		
//		season[1] = "����";
//		for(int i=0; i<season.length; i++){
//			System.out.println(season[i]);
//		}
		
		int[] scores = { 83, 95, 75};
		int sum = 0;
		//for���� �̿��Ͽ� ���հ� ����� ���϶�.
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("���� :" + sum);
		double avg = (double) sum / scores.length;
		System.out.println("��� :" + avg);
		
//		Ÿ��[] ����;
//		���� = {��0, ��1, ��2, ��3}; ������ ����
//		���� = new Ÿ��[] {��0, ��1, ��2, ��3}; ����
//		
//		String[] members = null;
//		members = new String[] {"ȸ��1", "ȸ��2", "ȸ��3"};
//		
//		void �Լ��̸�(����Ÿ�� �����̸�) {
//			System.out.println();
//		}
//		
//		int void �Լ��̸�(����Ÿ�� �����̸�) {
//		System.out.println();
//		return;
//		
//		int[] scores = {1,2,3,4,5};
//		void sum(int[]sc) {
//			?????
//		}
//		�迭 ���ͷ��� ���� �Ű������� ���� ���� new �ؾ� �Ѵ�.
//		void sum(new int[] {1,2,3,4,5}) {
//			?????
//		}
		
		}

}
