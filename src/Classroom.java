import java.awt.Color;

public class Classroom {
	
	private Person[] students;
	private Person teacher;
	
	public Classroom(String firstName, String familyName, Color eyeColor, int IQ, Person[] students, Person teacher) {
		this.students = students;
		this.teacher = teacher;
	}
	
	public String getSubject() {
		return null;	
	}
	
	public double classAverage() {
		return 0;
	}
	
	public String printClass() {
		return null;
		
	}
	
}
