package Exam14;

public class CarExam {

	public static void main(String[] args) {

		Car myCar = new Car();
		
		myCar.setSpeed(-10);
		System.out.println("����ӵ� : " + myCar.getSpeed());
		
		myCar.setSpeed(100);
		System.out.println("����ӵ� : " + myCar.getSpeed());
		
		//����
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("����ӵ� : " + myCar.getSpeed());
	}

}
