public abstract class Person {
	
	private String firstName;
	private String familyName;
	private int shoeSize;
	private int IQ; 
	
	public Person(String firstName, String familyName, int shoeSize, int IQ)
	{
		
		this.firstName = firstName;
		this.familyName = familyName;
		this.shoeSize = shoeSize;
		this.IQ = IQ;
	}
 

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFamilyName() {
		return familyName; 
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public int getShoeSize() {
		return shoeSize;
	}

	public void setShoeSize(int shoeSize) {
		this.shoeSize = shoeSize;
	}

	public int getIQ() {
		return IQ;
	}

	public void setIQ(int IQ) {
		this.IQ = IQ;
	}
	
	public abstract String toString(); 
	
}
