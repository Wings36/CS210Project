// by Dien Nguyen

public class EmployeeClient {

	public static void main(String[] args) {
		Lawyer joe = new Lawyer();
		WebDesigner tony = new WebDesigner();
		
		System.out.println("Information for lawyer Joe: ");
		System.out.print(joe);
		System.out.println("\nInformation for web designer Tony: ");
		System.out.println(tony);
		
		tony.addHoursWorked(35);
		tony.addHoursWorkedHome(6);
		joe.addHoursWorked(50);
		
		System.out.println("Tony has worked " + tony.getHoursWorked() + " this week out of his scheduled hours of " + tony.getWeeklyHours() + " hours. " + tony.getHoursWorkedHome() + " of which were hours worked from home.");
		
	}
	
}
