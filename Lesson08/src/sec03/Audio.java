package sec03;

public class Audio implements RemoteControl{
	
	//필드
	private int volume;
	private int defaultVolume; //현재의 볼륨을 저장하는 필드
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 겹니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
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
		System.out.println("현재 Audio의 볼륨은 : " + volume );
	}
	
	//디폴트 메소드의 재정의 시에는 반드시 public 으로 해야 하며 default 는 생략한다.
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.defaultVolume = this.volume;
			System.out.println("무음 처리합니다.");
			setVolume(RemoteControl.MIN_VOLUME);
		}else {
			System.out.println("무음 해제합니다.");
			setVolume(this.defaultVolume); //muse 해제될 경우 원래의 볼륨값으로 돌아감
		}
	}

}
