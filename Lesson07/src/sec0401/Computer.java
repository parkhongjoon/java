package sec0401;

public class Computer extends Calculator{

	@Override
	public double areaCircle(double r){
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI * r * r; 
	
	}
	
}
