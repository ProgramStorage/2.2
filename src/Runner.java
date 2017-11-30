import java.awt.Color;
import java.util.Random;

public class Runner {

	private static String[] firstName = {"First", "John", "Jane", "Nathan", "Joe", "Steve", "Liam", "Noah", "Jake", "Logan", "David"};
	private static String[] familyName = {"Last", "Doe", "Levin", "Obama", "Asher", "Newman", "Brown", "Williams", "Paul", "Smith", "Jones"};
	private static String[] subject = {"AP Computer Science", "Chemistry", "AP Calculus", "Macro Economics", "Physical Education", "AP United States History", "Statistics", "Algebra", "Geometry", "Global Studies"};
	private static String[] title = {"Mr", "Mrs", "Ms", "Miss", "Dr", "Professor"};
	
	public static void main(String[] args) {
	
		new Teacher(null, null, null, 0, null, null);
		Person Student = new Student(null, null, null, 0, 0, 0, 0);
		Classroom Classroom = new Classroom(null, null, null, 0, null, Student);
		
		System.out.print (Classroom.printClass() + Classroom.classAverage());
		
		randomStudent();
	
	}
	
	public static Student randomStudent() {
		int ACT = (int)(Math.random())*36+1;
		int APClasses = (int)(Math.random()*11);
		int IQ = (int)(Math.random() * 200 + 1);
		Random r2 = new Random();
		//highest gpa is 100 x 1.1 which is 110
		double GPA = (r2.nextInt(1210)) / 10;
		

		Random r = new Random();
		int red = r.nextInt(256);
		int green = r.nextInt(256);
		int blue = r.nextInt(256);

		Color eyeColor = new Color(red,green,blue);
		
		Random r1 = new Random();
		return new Student(firstName[r1.nextInt(firstName.length)],familyName[r1.nextInt(familyName.length)], eyeColor , IQ, GPA, ACT, APClasses);
		
		}
	
	public static Teacher randomTeacher()
	{
		int IQ = (int)(Math.random() * 200 + 1);
		
		Random r2 = new Random();
		int red = r2.nextInt(256);
		int green = r2.nextInt(256);
		int blue = r2.nextInt(256);

		Color eyeColor = new Color(red,green,blue);
		
		Random r = new Random();
		return new Teacher (firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor, IQ, title[r.nextInt(title.length)], 
				subject[r.nextInt(subject.length)]);
	}

	}
