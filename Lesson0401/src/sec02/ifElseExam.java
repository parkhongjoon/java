package sec02;

import java.util.Scanner;

public class ifElseExam {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��ȣ�� �Է��ϼ���.");
		int num=sc.nextInt();
		if(num > 90) {
			System.out.println("A������ �����̽��ϴ�.");
		}else if(num > 80){
			System.out.println("B������ �����̽��ϴ�.");
		}else if(num > 70){
			System.out.println("C������ �����̽��ϴ�.");
		}else if(num > 60){
			System.out.println("D������ �����̽��ϴ�.");
		}else {
			System.out.println("F������ �����̽��ϴ�.");
		}
	}

}
