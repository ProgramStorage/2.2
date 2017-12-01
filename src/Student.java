public class Student extends Person{
	private double GPA;
	private int ACT;
	private int APClasses;
	
	public Student(String firstName, String familyName, int shoeSize, int IQ, double GPA, int ACT, int APClasses) {
		super(firstName, familyName, shoeSize, IQ);
		this.ACT = ACT;
		this.GPA = GPA;
		this.APClasses = APClasses;
	}
	public void setGPA(double GPA) {
		this.GPA = GPA;
	}
	public void setACT(int ACT) {
		this.ACT = ACT;
	}
	public void setAPClasses(int aPClasses) {
		this.APClasses = aPClasses;
	}
	public int getACT() { 
		return ACT;
	}

	public int getAPClasses() {
		return APClasses;
	}

	
	public double getGPA() {
		return GPA;
	}
	
	@Override
	public String toString() {
		return getFamilyName() +"," + getFirstName();
		
	}
	
}

