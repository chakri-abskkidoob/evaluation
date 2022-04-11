package evaluation;

public class AlarmClock {
	
	public static void main(String[] args) {
		String arr[] = {"Sunday", "Monday", "Tuesday","Wednesday", "Thursday", "Friday", "Saturday"};
		boolean day = true;
		for(int a = 0; a<arr.length; a++) {
			if(day == true && arr[a] == "Sunday" || arr[a] == "saturday") {
				System.out.println("off");
			}
			else if(day == true && arr[a] != "Sunday" || arr[a] != "Saturday") {
				System.out.println("10:00");
			}
			else if (day == false && arr[a] != "Sunday" || arr[a] != "Saturday") {
				System.out.println("7:00");
			}
			else if (day == false && arr[a] != "Sunday" || arr[a] != "Saturday") {
				System.out.println("10:00");
			}
			else {
				System.out.println("error");
			}
		}
	}
}
