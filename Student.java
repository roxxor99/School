
public class Student {
	// Private Instance Variables
	private String studentID;
	private String firstName;
	private String lastName;
	private String email;
	private int age;
	private int[] grades;

	// Constructor(main)
	public Student(String studentID, String firstName, String lastName, String email, int age, int[] grades) {
		
		//super(); 
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
		this.grades = grades;
		
/*		setStudentID(studentID);
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setAge(age);
		setGrades(grades);
*/
	}

	// Accessors (get)
	public String getStudentID() {
		return studentID;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

	public int[] getGrades() {
		return grades;
	}

	// Mutators (set)
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGrades(int[] grades) {
		this.grades = grades;
	}

	public void print() {

		String identification = this.getStudentID();
		String firstName = this.getFirstName();
		String lastName = this.getLastName();
		int age = this.getAge();
		int[] grades = this.getGrades();
		int grade1 = grades[0];
		int grade2 = grades[1];
		int grade3 = grades[2];

		System.out.println("Student ID: " + identification + "\t\t" + "First Name: " + firstName + "\t" + "Last Name: "
				+ lastName + "\t" + "Age: " + age + "\t\t" + "Grades: " + grade1 + " " + grade2 + " " + grade3);

		/*
		 * System.out.println("Student ID:\t" + getStudentID() +
		 * "\tFirst Name\t" + getFirstName() + "\tLast Name\t" + getLastName() +
		 * "\tEmail\t" + getEmail() + "\tAge\t" + getAge() + "\tGrades\t" +
		 * getGrades()[0] + " " + getGrades()[1] + " " + getGrades()[2]);
		 */
	}

}
