package Class01;

public class SingleOpExam {

	public static void main(String[] args) {

		//int x = -100;
		//x = -x;
		//System.out.println("x : " + x);
		
		//byte b = 100;
		//byte y = -b; -��ȣ�� �����̱� ������ ����� int
		//int y = -b;
		//System.out.println("y : " + y);
		
		int x = 10;
		int y = 10;
		int z;
		
		x++;
		++x;
		System.out.println("x = " + x);
		
		System.out.println("-------------");
		y--;
		--y;
		System.out.println("y = " + y);
		System.out.println("-------------");

		z = x++;
		System.out.println("z = " +z);
		System.out.println("x = " +x);
		System.out.println("--------------");
		
		z = ++x + y++;
		/*
		 * 1. x�� 1�� ������
		 * 2. 1�� ������ x�� y�� ������
		 * 3. ������ ���� z�� �Էµ�
		 * 4. y�� 1�� ������
		 */
		
		System.out.println("x = " + x);
		System.out.println("z = " + z);
		System.out.println("y = " + y);
		System.out.println("------------");
		
	}

}
