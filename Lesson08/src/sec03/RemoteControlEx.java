package sec03;

public class RemoteControlEx {

	public static void main(String[] args) {
		System.out.println("�ִ뺼����  : " + RemoteControl.MAX_VOLUME + "�Դϴ�.");
		System.out.println("�ּҺ�����  : " + RemoteControl.MIN_VOLUME + "�Դϴ�.");
		RemoteControl cc;
		
		cc = new Television();
		cc.turnOn();
		
		cc = new Audio();
		cc.turnOn();
		cc.setVolume(5);
		cc.setMute(true);
		cc.setMute(false);
		cc.turnOff();
		
		System.out.println();
		
		RemoteControl.changeBattery();
		
	}
}
