package Sec3;

public class StringConvExam {

	public static void main(String[] args) {

		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		
		String str1 = String.valueOf(value1);
		String str2 = String.valueOf(value1);
		String str3 = String.valueOf(value1);

		System.out.println("value1: " + str1);
		System.out.println("value2: " + str2);
		System.out.println("value3: " + str3);
		
	}

}
