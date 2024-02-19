package sec06;

public class BitLogExam {

	public static void main(String[] args) {

		
		// ��Ʈ ������ &, | �ϳ��� ��� �� ������ �ΰ�
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 = " + (45 | 25));
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("~45 = " + (~45));
		System.out.println("~10 = " + (~10));
		System.out.println("-------------- THE END -----------");
		
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 + 1;
		System.out.println(toBinaryString(v1) + "(������ " +v1+")");
		System.out.println(toBinaryString(v2) + "(������ " +v1+")");
		System.out.println(toBinaryString(v3) + "(������ " +v1+")");

	}
		
		public static String toBinaryString(int num) {
			
			String str = Integer.toBinaryString(num); // ������ 2�� ���ڿ��� ��ȯ���ִ� �޼ҵ�
			while(str.length() < 32) {
				str = "0" + str;
			}
			return str;
		}
		
	}
	
	

