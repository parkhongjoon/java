package sec02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int me = in.nextInt();
		int dice = (int)((Math.random()*6)+1);
		if(me == dice) {
			System.out.println("�����ϴ�.");
		}else if (me < dice) {
			System.out.println("�ֻ����� �� �����ϴ�.");
		}else {
			System.out.println("�ֻ����� �� �����ϴ�.");
		}
		
	}

}


