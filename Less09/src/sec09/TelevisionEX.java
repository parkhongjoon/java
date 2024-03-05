package sec09;

public class TelevisionEX {

	public static void main(String[] args) {

		Television tv = new Television();
		
		//info를 출력하시오.
		System.out.println(Television.info);
		
		Television.method2();
		
		System.out.println(tv.pay);
		
		tv.method1(5000000);
	}

}
