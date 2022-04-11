package evaluation;

public class Course {
	int courseId;
	String courseName;
	int courseFee;
	void displayCouseDetails (String[] args) {
		System.out.println(courseId);
		System.out.println(courseName);
		System.out.println(courseFee);
	}
	public static void authenticate(){
		String username = "Admin";
		String password = "1234";
		Course details1 = new Course();
		details1.courseId = 10;
		details1.courseName = "FSWD";
		details1.courseFee = 10000;
		if(username == "Admin" && password == "1234") {
			System.out.println(details1.courseId);
			System.out.println(details1.courseName);
			System.out.println(details1.courseFee);
		}
		else {
			System.out.println("Invalid username and password");
		}
		
	}
}
