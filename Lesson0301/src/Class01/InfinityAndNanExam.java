package Class01;

import java.util.Scanner;

public class InfinityAndNanExam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("x���� ���ڸ� �Է��ϼ���.");
		//String strX = sc.nextLine():
		//int X = Integer.parseInt(strX);
		int x = sc.nextInt();
		
		System.out.println("y���� ���ڸ� �Է��ϼ���.");
		double y = sc.nextDouble();
		
		double z = x / y;
		
		
		//int x = 5;
		//double y = 0.0;
		//double z = x / y;
		//System.out.println(z);
		//System.out.println(z + 10000);
		
		//����ó��
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("���� ����� �� ����.");
		}else {
			System.out.println( z + 2 );
		}
		
		sc.close();
	}

}
