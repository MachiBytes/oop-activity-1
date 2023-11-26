package telephone;

public class SmartFone extends Telephone {
	// Attributes
	private String strOwner;
	private String strColor;

	// Constructors
	public SmartFone() {}

	public SmartFone(String strManufacturer, String strNetwork, int intCountryCode, int intAreaCode, String strNumber) {
		super(strManufacturer, strNetwork, intCountryCode, intAreaCode, strNumber);
	}

	public SmartFone(String strManufacturer, String strNetwork, int intCountryCode, int intAreaCode, String strNumber, String strOwner, String strColor) {
		super(strManufacturer, strNetwork, intCountryCode, intAreaCode, strNumber);
		this.strOwner = strOwner;
		this.strColor = strColor;
	}

	// Accessors
	public String toString() {
		return super.toString() + "\n\tOwner: " + this.strOwner + "\n\tColor: " + this.strColor;
	}

	public String getOwner() {
		return this.strOwner;
	}

	public String getColor() {
		return this.strColor;
	}

	// Mutators
	public void setOwner(String strOwner) {
		this.strOwner = strOwner;
	}

	public void setColor(String strColor) {
		this.strColor = strColor;
	}

	// Methods
	public void installApp(String strAppName) {
		System.out.println("Installing " + strAppName);
	}

	public void uninstallApp(String strAppName) {
		System.out.println("Uninstalling " + strAppName);
	}
}