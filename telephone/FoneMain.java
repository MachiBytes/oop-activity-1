package telephone;

public class FoneMain {
	public static void main(String[] args) {
		SmartFone objPhone = new SmartFone(
			"Ayala Malls",
			"PLDT",
			63,
			1550,
			"9474920330",
			"Aki",
			"Red");

		System.out.println("==================================================");
		System.out.println("Initial Instance:");
		System.out.println("==================================================");
		System.out.println(objPhone);

		System.out.println("==================================================");
		System.out.println("Testing Accessors and Modifies:");
		System.out.println("==================================================");
		System.out.println("Telephone:");

		objPhone.setManufacturer("SM Megamall");
		System.out.println("\tManufacturer: " + objPhone.getManufacturer());

		objPhone.setNetwork("Smart");
		System.out.println("\tNetwork: " + objPhone.getNetwork());

		objPhone.setCountryCode(64);
		System.out.println("\tCountry Code: " + objPhone.getCountryCode());

		objPhone.setAreaCode(1616);
		System.out.println("\tArea Code: " + objPhone.getAreaCode());

		objPhone.setNumber("9999999999");
		System.out.println("\tNumber: " + objPhone.getNumber());

		objPhone.setOwner("Sir Derick");
		System.out.println("\tOwner: " + objPhone.getOwner());

		objPhone.setColor("Black");
		System.out.println("\tColor: " + objPhone.getColor());

		System.out.println("==================================================");
		System.out.println("Testing methods/actions");
		System.out.println("==================================================");

		objPhone.call("9119119191");
		objPhone.receiveCall("9119119191");
		objPhone.rejectCall("9119119191");
		objPhone.installApp("Flappy Bird");
		objPhone.uninstallApp("Flappy Bird");
	}
}