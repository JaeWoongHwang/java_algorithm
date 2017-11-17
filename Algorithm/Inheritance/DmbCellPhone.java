package Inheritance;

public class DmbCellPhone extends CellPhone {
	// Field
	int channel;

	// Constructor
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}

	// Method
	void turnOnDmb() {
		System.out.println("Start of DMB broadcast" + "Channel : " + channel);
	}

	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("Change the channel for > " + "Channel :" + channel);
	}

	void turnOffDmb() {
		System.out.println("Stop the DMB broadcast");
	}
}
