package Inheritance;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// Create DmbCellPhone instance
		DmbCellPhone dmbCellPhone = new DmbCellPhone("BlackBerry", "Black", 10);

		// Field that was inherited from CellPhone class
		System.out.println("Model : " + dmbCellPhone.model);
		System.out.println("Color : " + dmbCellPhone.color);

		// Field of DmbCellPhone Class
		System.out.println("Channel : " + dmbCellPhone.channel);

		// Calling inherited methods from the CellPhone class
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("Hello");
		dmbCellPhone.receiceVoice("Hello, I'am Hong");
		dmbCellPhone.sendVoice("I'am happy to call you");
		dmbCellPhone.hangUp();

		// Calling method from DmbCellPhone class
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();

	}

}
