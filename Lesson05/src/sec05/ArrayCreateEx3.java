package sec05;

public class ArrayCreateEx3 {

	public static void main(String[] args) {

		//�迭 ����� ����
		int[] arr1 = new int[3];
		
		//�ʱⰪ���� ���õ�
		for(int i = 0; i < 3; i++) {
			System.out.print(arr1[i] + ", ");
		}
		System.out.println();
		System.out.println("++++++++++++++++");
		arr1[0] = 20;
		arr1[1] = 40;
		//�ʱⰪ���� ���õ�
		for(int i = 0; i < 3; i++) {
			System.out.print(arr1[i] + ", ");
		}
//		System.out.println();
//		System.out.println("++++++++++++++++");
//		
//		double[] arr2 = new double[3];
//		
//		for(double i = 0; i < 3; i++) {
//			System.out.print(arr2[i] + ", ");
//		}
//		System.out.println();
//		System.out.println("+++++++++++++++++++");
//
//	}
	
		String[] arr3 = new String[4];
		for(int i = 0; i <4; i++) {
			System.out.println(arr3[i] + ", ");
		}
		System.out.println();
		System.out.println("++++++++++++++++++");
		arr3[0] = "��";
		arr3[1] = "����";
		
		arr3[2] = "����";
		for(int i = 0; i < 4; i++) {
			System.out.print(arr3[i] + ", ");
		}
		System.out.println();
		System.out.println("++++++++++++++++");

	}
}