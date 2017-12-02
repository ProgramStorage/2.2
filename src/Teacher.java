public class Teacher extends Person{
	
	private String subject;
	private String title;
	
	public Teacher(String firstName, String familyName, int height, int IQ, String subject, String title) 
	{
		super(firstName, familyName, height, IQ);
		this.subject = subject;
		this.title = title;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return getTitle() +"." + " "+ getFamilyName();
	}

}
