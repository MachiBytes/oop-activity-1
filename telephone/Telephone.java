package telephone;

public class Telephone {
	private String strManufacturer;
	private String strNetwork;
	private int intCountryCode;
	private int intAreaCode;
	private String strNumber;

	// Constructors
	public Telephone() {}

	public Telephone(String strManufacturer, String strNetwork, int intCountryCode, int intAreaCode, String strNumber) {
		this.strManufacturer = strManufacturer;
		this.strNetwork = strNetwork;
		this.intCountryCode = intCountryCode;
		this.intAreaCode = intAreaCode;
		this.strNumber = strNumber;
	}

	// Accessors
	public String toString() {
		return "Telephone:\n\tManufacturer: " + this.strManufacturer + "\n\tNetwork: " + this.strNetwork + "\n\tCountry Code: " +  this.intCountryCode + "\n\tArea Code: " + this.intAreaCode + "\n\tNumber: " + this.strNumber;
	}

	public String getManufacturer() {
		return this.strManufacturer;
	}

	public String getNetwork() {
		return this.strNetwork;
	}

	public int getCountryCode() {
		return this.intCountryCode;	
	}

	public int getAreaCode() {
		return this.intAreaCode;
	}
	
	public String getNumber() {
		return this.strNumber;
	}

	// Mutators
	public void setManufacturer(String strManufacturer) {
		this.strManufacturer = strManufacturer;
	}

	public void setNetwork(String strNetwork) {
		this.strNetwork = strNetwork;
	}

	public void setCountryCode(int intCountryCode) {
		this.intCountryCode = intCountryCode;
	}

	public void setAreaCode(int intAreaCode) {
		this.intAreaCode = intAreaCode;
	}
	
	public void setNumber(String strNumber) {
		this.strNumber = strNumber;
	}

	// Methods
	public void call(String strNumber) {
		System.out.println("Calling " + strNumber);
	}

	public void receiveCall(String strNumber) {
		System.out.println("Accepting call from " + strNumber);
	}

	public void rejectCall(String strNumber) {
		System.out.println("Incoming call from " + strNumber + " rejected...");
	}
}