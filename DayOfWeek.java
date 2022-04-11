package evaluation;

public class DayOfWeek {
	public static void main(String[] args) {
		String[] arr = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		int dayOfTheWeek = 5;
		boolean holiday = true;
		for(dayOfTheWeek = 1; dayOfTheWeek <=arr.length; dayOfTheWeek++) {
			if(holiday == true && (dayOfTheWeek == 6 || dayOfTheWeek == 7)) {
				System.out.println("Sleep in!");
			}
			else {
				System.out.println("wake up at 7:00");
			}
		}
	}
}
