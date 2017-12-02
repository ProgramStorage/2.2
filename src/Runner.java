import java.util.Random;
import java.lang.Math; 

public class Runner {

	private static String[] firstName = {"First", "John", "Jane", "Nathan", "Joe", "Steve", "Liam", "Noah", "Jake", "Logan", "David"};
	private static String[] familyName = {"Last", "Doe", "Levin", "Obama", "Asher", "Newman", "Brown", "Williams", "Paul", "Smith", "Jones"};
	private static String[] subject = {"AP Computer Science", "Chemistry", "AP Calculus", "Macro Economics", "Physical Education", "AP United States History", "Statistics", "Algebra", "Geometry", "Global Studies"};
	private static String[] title = {"Mr", "Mrs", "Ms", "Miss", "Dr", "Professor"};
	
	public static void main(String[] args) 
	{
		
		 
		System.out.println(randomTeacher());
		System.out.println(randomStudent());
	}
	
	
	public static Student randomStudent() {
		int ACT = (int)(Math.random())*36+1;
		int APClasses = (int)(Math.random()*11);
		int IQ = (int)(Math.random()) * 200 + 1;
		int height = (int)(Math.random() * 84 + 1);
		double GPA = (int)(Math.random() * 110 + 1);
		
		
		Random r = new Random();
		return new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], height , IQ, GPA, ACT, APClasses);
		
		}
	
	public static Teacher randomTeacher()
	{
		int IQ = (int)(Math.random()) * 200 + 1;
		int height = (int)(Math.random() * 84 + 1);
		
		Random r = new Random();
		return new Teacher(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], height, IQ, title[r.nextInt(title.length)], 
				subject[r.nextInt(subject.length)]);
	}

}
