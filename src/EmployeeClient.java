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
		System.out.print(tony);
		System.out.println("\nInformation about secretary Jane: ");
		System.out.print(jane);
		System.out.println("\nInformation about legal secretary Ana: ");
		System.out.print(ana);
	
		tony.addHoursWorked(35);
		tony.addHoursWorkedHome(6);
		joe.addHoursWorked(50);1
		ana.addHoursWorked(44);
		
		System.out.println("\nTimesheet for employees this week: ");
		System.out.println("\nTony has worked " + tony.getHoursWorked() + " hours this week out of his scheduled hours of " + tony.getWeeklyHours() + " hours. " + tony.getHoursWorkedHome() + " of which were hours worked from home.");
		System.out.println("Joe has worked " + joe.getHoursWorked() + " hours this week out of his scheduled hours of " + joe.getWeeklyHours() + " hours.");
		System.out.println("Ana has worked " + ana.getHoursWorked() + " hours this week out of her scheduled hours of " + ana.getWeeklyHours() + " hours.");
		System.out.println("Jane was on vacation this week. She worked " + jane.getHoursWorked() + " hours this week out of her scheduled hours of " + jane.getWeeklyHours() + " hours.");
		
		joe.removeHoursWorked(7);
		System.out.println("Error detected with Joe's timesheet and has been corrected. 7 hours has been removed from his timesheet, and his hours worked this week is " + joe.getHoursWorked() + " hours.\n");
		
		employeeList[0] = joe;
		employeeList[1] = tony;
		employeeList[2] = jane;
		employeeList[3] = ana;
		
		System.out.println("Here is a compiled report on all employees: \n");
		for(Employee k: employeeList)
		{
			System.out.println(k);
		}
	}
	
}
