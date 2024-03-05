package sec03;

public interface RemoteControl {
	//�������̽����� �ʵ�� public ������� ���� �� �ִ�. 
	//�������̽� �������� �ʵ忡 ���� �����ϸ� �װ��� �� ����̴�.
	//����� �빮�ڷ� ����
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�������̽� ������ ���ǵǴ� �޼ҵ�� ��� �߻� �޼ҵ� �̴�.
	 void turnOn();
	 void turnOff();
	 void setVolume(int volume);
	
	//����Ʈ �޼���
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("���� ����");
		}
	}
	
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
