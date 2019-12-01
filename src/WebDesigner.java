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
		workFromHomeHours = 0;
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
	
	public void removeHoursWorked(int hours) throws IllegalArgumentException
	{
		if((workedHours - hours) < 0)
			throw new IllegalArgumentException("Hours worked cannot be negative");
		workedHours -= hours;
	}
	
	public void removeHomeHoursWorked(int hours) throws IllegalArgumentException
	{
		if((workFromHomeHours - hours) < 0)
			throw new IllegalArgumentException("Hours worked cannot be negative");
		workFromHomeHours -= hours;
		workedHours -= hours;
	}
	
	public void addHoursWorked(int hours)
	{
		workedHours += hours;
	}
	
	public void addHoursWorkedHome(int hours)
	{
		workFromHomeHours += hours;
		workedHours += hours;
	}
	
	public int getHoursWorkedHome()
	{
		return workFromHomeHours;
	}
	
	public int getHoursWorked()
	{
		return workedHours;
	}
	
	public String toString()
	{
		String format = "";
		format += getJobDescription();
		format += "\nWeb designer gets paid $" + salary + " a year. ";
		format += "Web designers are scheduled to work " + scheduledHours + " hours per week. ";
		format += "This web designer has worked " + (workedHours + workFromHomeHours) + "(" + workFromHomeHours + " at home) hours this week.\n";
		
		return format;
	}
}
