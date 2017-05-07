
import java.util.ArrayList;

public class Roster {

	static ArrayList<Student> classRoster = new ArrayList<>();

	
	public static void main(String[] args) {
		classRoster.add(new Student("1", "John", "Smith", "John1989@gmail.com", 20, new int[] { 88, 79, 59 }));
		classRoster.add(new Student("2", "Suzan", "Erickson", "Erickson_1990@gmailcom", 19, new int[] { 91, 72, 85 }));
		classRoster.add(new Student("3", "Jack", "Napoli", "The_lawyer99yahoo.com", 19, new int[] { 85, 84, 87 }));
		classRoster.add(new Student("4", "Erin", "Black", "Erin.black@comcast.net", 22, new int[] { 91, 98, 82 }));
		classRoster.add(new Student("5", "Jed", "Gunderson", "jgunde4@wgu.edu", 35, new int[] { 85, 88, 93 }));

		/*
		 * "1","John","Smith","John1989@gmail.com",20,88,79,59;
		 * "2","Suzan","Erickson","Erickson_1990@gmailcom",19,91,72,85;
		 * "3","Jack","Napoli","The_lawyer99yahoo.com",19,85,84,87;
		 * "4","Erin","Black","Erin.black@comcast.net",22,91,98,82;
		 * "5","Jed","Gunderson","jgunde4@wgu.edu",35,85,88,93;)
		 */
		// printAll();
		// printAverageGrade();

	}

	/*
	 * public static void add(String studentID, String firstName, String
	 * lastName, String email, int age, int grade1, int grade2, int grade3) {
	 * 
	 * int[] grades = {grade1, grade2, grade3}; Student newStudent = new
	 * Student(studentID, firstName, lastName, email, age, grades);
	 * classRoster.add(newStudent); }
	 */

	public static void remove(String studentID) {
		// Removes students from the roster by student ID
		// Need an error message if it does not exist
		boolean studentFound = false;

		for(int i=0; i<classRoster.size(); i++) {

		    if (classRoster[i].getStudentID() == studentID)
		    {
		        studentFound = true;
		        classRoster.remove(i);
		        break;
		    }

		}
		if (studentFound == false) {
		        System.out.println("Not Found");
		        
		    }

	public static void printAll() {

	}
	
	// method that prints the average grades for students
	public static void printAverageGrade(String studentID) {
		// loop through ArrayList classRoster
		
		}

	}

	public static void printInvalidEmails() {

	}

}
