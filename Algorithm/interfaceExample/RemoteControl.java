package interfaceExample;

public interface RemoteControl {
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;

	// Abstract method
	public void turnOn();

	public void turnOff();

	public void setVolume(int volume);

	// Default method
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("On mute");
		} else {
			System.out.println("Off mute");
		}
	}

	// Static method
	static void changeBattery() {
		System.out.println("Change a battery");
	}
}
