package Exam14;

public class Car {
	//필드선언
	private int speed;
	private boolean stop;
	
	//speed 의 getter setter
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0 ) {
			this.speed = 0;
		}else {
			this.speed = speed;
		}
	}
	
	//stop의 getter setter
	public boolean isStop() {
		return stop;
		
	}
		public void setStop(boolean stop) {
			this.stop = stop;
			if(stop == true) this.speed = 0;
		}
		

	}

