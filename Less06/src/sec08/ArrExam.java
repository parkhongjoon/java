package sec08;

public class ArrExam {

	public static void main(String[] args) {


		ArrMethod arrs = new ArrMethod();
		
//		int[] nums = {1, 2 , 3, 4, 5, 6, 7, 8, 9, 10};
		int rs = arrs.sum(new int[] {1, 2 , 3, 4, 5, 6, 7, 8, 9, 10});
//		int rs = arrs.sum(nums); ���� ���ڸ� ���� �������� new int[] ���
		System.out.println("1���� 10������ ���� : " + rs);
		
		int rs2 = arrs.sum2(1,2,3,4,5,6,7,8,9,10);
		System.out.println("1���� 10���� ���� : " + rs2);
	}		

}
