package Tv;

public class Television {
	String model;
	int channel;
	int volume;
	
	void powerOn() {
		System.out.println("TV를 켭니다.");
	}
	void powerOff() {
		System.out.println("TV를 끕니다.");
	}
	void changeChannel(int channel) {
		this.channel= channel;
		System.out.printf("채널을 %d번으로 변경합니다.\n",channel);
	}
	void changeSound(int volume) {
		this.volume=volume;
		System.out.printf("소리를 %d(으)로 조절합니다.\n",volume);
	}
}
