package sec04;

public class AnimalEx {
	
	public static void main(String[] args) {
		
		Animal aa = new Animal(); //�θ� Ŭ����
		Bird bb = new Bird(); //�θ� Ŭ������ ��ӹ��� �ڽ� Ŭ����
		Cat cc = new Cat();
		Dog dd = new Dog();
		
		aa.cry(); //�θ� Ŭ������ cry() �޼ҵ带 �ڽĵ��� �ڽſ� �°� �������̵��ؼ� �����.
		bb.cry();
		cc.cry();
		dd.cry();
	}
}
