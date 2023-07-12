package C20230712;

class myTV{
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL =100;
	final int MIN_CHANNEL = 1;
	
	void turnOnOff() {
		isPowerOn = !isPowerOn;
	}
	
	void volumeUp() {
		if(volume < MAX_VOLUME)
			volume++;
	}
	void volumeDown() {
		if(volume > MIN_VOLUME)
			volume--;
	}
	void channelUp() {
		if(channel==MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		}else {
			channel ++;
		}
	}
	void channelDown() {
		if(channel==MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		}else {
			channel--;
		}
	}
	
}

public class Q1 {
	
	public static void main(String[] args) {
		myTV t = new myTV();
		t.channel =100;
		t.volume = 0;
		System.out.println("c : "+t.channel + " v : "+t.volume);
		
		
	}

	
}
