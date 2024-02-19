package Sec07;

public class BitShiftExam {

	public static void main(String[] args) {

		int num1 = 1;
		int rs1 = num1 << 3;
		int rs2 = num1 * (int) Math.pow(2, 3);
		System.out.println(rs1);
		System.out.println(rs2);
		
		int num2 = -8;
		int rs3 = num2 >> 3;
		int rs4 = (int) (num2 / Math.pow(2, 3));
		System.out.println(rs3);
		System.out.println(rs4);
		
		
		//1. ���� 772�� 2������ ǥ���϶�
		int val = 772;
		String strVal = Integer.toBinaryString(val);
		while(strVal.length() < 32) {
			strVal = "0" + strVal;
		}
		System.out.println(strVal);
		
		//2. �������� 3byte �̵� �� ������ 1����Ʈ�� �о��
		// 00000000 00000000 00000011 00000100 => 00000000 => 0
		byte byte1 = (byte) (val >>> 24);
		System.out.println(byte1);
		
		//3. �������� 2byte �̵� ������ 1��Ʈ�� �о��
		// 00000000 00000000 00000011 00000100 => 00000000 00000000 => 0
		byte byte2 = (byte) (val >>> 16);
		System.out.println(byte2);
		
		//4. �������� 1����Ʈ �̵� ������ 1����Ʈ�� �о��
		// 00000000 00000000 00000011 00000100  => 00000011 => 3
		byte byte3 = (byte) (val >>> 8);
		System.out.println(byte3);
		
		//5. ������ 1����Ʈ�� �о��
		// 00000000 00000000 00000011 00000100 => 00000100 => 4
		byte byte4 = (byte) val;
		System.out.println(byte4);
		
		
	}
}
