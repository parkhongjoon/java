package Exam132.package1;

public class A {
	//�ʵ弱��
		public int field1; //public
		
		int field2; //default
		
//		private int field3; //private
		
		public A() {
			//Ŭ���� ���ο����� ������������ ������ ����.
			
			field1 = 1;
			field2 = 2;
//			field3 = 3;
			
			method1();
			method2();
			method3();
		}
		
		//method
		public void method1() {}
		void method2() {}
		private void method3() {}
}
