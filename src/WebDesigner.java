//designed by Dien Nguyen

public class WebDesigner implements Employee {
	private int salary;
	private int scheduledHours;
	private int workedHours;
	private int workFromHomeHours;
	
	public WebDesigner()
	{
		salary = 77500;
		scheduledHours = 42;
		workedHours = 0;
	}
	
	public int getSalary()
	{
		return salary;
	}

	public String getJobDescription()
	{
		return "A web designer creates the look, layout, and features of a website. Web designers can work from home, from time to time.";
	}
	
	public int getWeeklyHours()
	{
		return scheduledHours;
	}
	
	public void addHoursWorked()
	{
		workedHours++;
	}
	
	public void addHoursWorked(int hours)
	{
		workedHours += hours;
	}
	
	public void addHoursWorkedHome(int hours)
	{
		workFromHomeHours += hours;
		workedHours += workFromHomeHours;
	}
	
	public int getHoursWorked()
	{
		return workedHours;
	}
	
	public String toString()
	{
		String format = "";
		format += getJobDescription();
		format += "\nWeb designer gets paid " + salary + " a year. ";
		format += "Web designers are scheduled to work " + scheduledHours + " hours per week. ";
		format += "This web designer has worked " + (workedHours + workFromHomeHours) + "(" + workFromHomeHours + " at home) hours this week.\n";
		
		return format;
	}
}
