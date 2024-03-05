package sec03;

public class Audio implements RemoteControl{
	
	//�ʵ�
	private int volume;
	private int defaultVolume; //������ ������ �����ϴ� �ʵ�
	
	@Override
	public void turnOn() {
		System.out.println("Audio�� ��ϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {

		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;	
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("���� Audio�� ������ : " + volume );
	}
	
	//����Ʈ �޼ҵ��� ������ �ÿ��� �ݵ�� public ���� �ؾ� �ϸ� default �� �����Ѵ�.
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.defaultVolume = this.volume;
			System.out.println("���� ó���մϴ�.");
			setVolume(RemoteControl.MIN_VOLUME);
		}else {
			System.out.println("���� �����մϴ�.");
			setVolume(this.defaultVolume); //muse ������ ��� ������ ���������� ���ư�
		}
	}

}
