// by Dien Nguyen

public class EmployeeClient {

	public static void main(String[] args) {
		Lawyer joe = new Lawyer();
		WebDesigner tony = new WebDesigner();
		Secretary jane = new Secretary();
		LegalSecretary ana = new LegalSecretary();
		Employee[] employeeList = new Employee[4];
		
		System.out.println("Information about lawyer Joe: ");
		System.out.print(joe);
		System.out.println("\nInformation about web designer Tony: ");
		System.out.println(tony);
		System.out.println("\nInformation about secretary Jane: ");
		System.out.println(jane + "\n");
		
		tony.addHoursWorked(35);
		tony.addHoursWorkedHome(6);
		joe.addHoursWorked(50);
		
		System.out.println("Tony has worked " + tony.getHoursWorked() + " hours this week out of his scheduled hours of " + tony.getWeeklyHours() + " hours. " + tony.getHoursWorkedHome() + " of which were hours worked from home.");
		System.out.println("Joe has worked " + joe.getHoursWorked() + " hours this week out of his scheduled hours of " + joe.getWeeklyHours() + " hours.");
		
		joe.removeHoursWorked(7);
		System.out.println("\nError detected with Joe's timesheet and has been corrected. 7 hours has been removed from his timesheet, and his hours worked this week is " + joe.getHoursWorked() + " hours.");
	}
	
}
