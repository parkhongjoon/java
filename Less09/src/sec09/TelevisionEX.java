package sec09;

public class TelevisionEX {

	public static void main(String[] args) {

		Television tv = new Television();
		
		//info�� ����Ͻÿ�.
		System.out.println(Television.info);
		
		Television.method2();
		
		System.out.println(tv.pay);
		
		tv.method1(5000000);
	}

}
