package sec08;

public interface Service {

	default void defaultMethod1() {
		System.out.println("defaultMethod1 ���� �ڵ�");
		defaultCommon();
	}
	
	default void defaultMethod2() {
		System.out.println("defaultMethod2 ���� �ڵ�");
		defaultCommon();
	}
	
	//private �޼ҵ�
	private void defaultCommon() {
		System.out.println("defaultMethod �ߺ� �ڵ�A");
		System.out.println("defaultMethod �ߺ� �ڵ�B");
	}
	
	//�����޼ҵ�
	static void staticMethod1() {
		System.out.println("staticMethod1 ���� �ڵ�");
		staticCommon();
	}
	
	static void staticMethod2() {
		System.out.println("staticMethod2 ���� �ڵ�");
		staticCommon();
	}
	
	//private ���� �޼ҵ�
	private static void staticCommon() {
		System.out.println("scaticMethod �ߺ��ڵ� C");
		System.out.println("scaticMethod �ߺ��ڵ� D");

	}
}
