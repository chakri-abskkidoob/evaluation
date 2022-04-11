package evaluation;

public class ScheduleOfWeek {
	public static void main (String[]args) {
		int dayofWeek = 1;
		String schedule = "Monday";
		switch (schedule) {
		case "Monday":
			System.out.println("Gym in the morning.");
			break;
		case "Tuesday":
			System.out.println("Class after work.");
			break;
		case "Wednesday":
			System.out.println("Meetings all day.");
			break;
		case "Thursday":
			System.out.println("Work from home.");
			break;
		case "Friday":
			System.out.println("Game night after work.");
			break;
		default:
			System.out.println("Free!");
		}
	}
}
