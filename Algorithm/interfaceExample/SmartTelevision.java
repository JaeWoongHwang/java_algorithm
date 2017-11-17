package interfaceExample;

public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;

	public void turnOn() {
		System.out.println("Turn on TV");
	}

	public void turnOFf() {
		System.out.println("Turn off TV");
	}

	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume > RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("Current TV volume : " + volume);
	}

	public void search(String url) {
		System.out.println(url + "is search");
	}
}
