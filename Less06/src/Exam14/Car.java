package Exam14;

public class Car {
	//�ʵ弱��
	private int speed;
	private boolean stop;
	
	//speed �� getter setter
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
	
	//stop�� getter setter
	public boolean isStop() {
		return stop;
		
	}
		public void setStop(boolean stop) {
			this.stop = stop;
			if(stop == true) this.speed = 0;
		}
		

	}

