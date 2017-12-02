
public abstract class Person {
	
	private String firstName;
	private String familyName;
	private int height;
	private int IQ; 
	
	public Person(String firstName, String familyName, int height, int IQ)
	{
		
		this.firstName = firstName;
		this.familyName = familyName;
		this.height = height;
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

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getIQ() {
		return IQ;
	}

	public void setIQ(int IQ) {
		this.IQ = IQ;
	}
	
	public abstract String toString(); 
	
}
