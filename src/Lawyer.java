//class by Dien Nguyen

public class Lawyer implements Employee {
	private int salary;
	private int scheduledHours;
	private int workedHours;	
	
	public Lawyer()
	{
		salary = 62000;
		scheduledHours = 40;
		workedHours = 0;
	}
	
	public int getSalary()
	{
		return salary;
	}
	
	public String getJobDescription()
	{
		return "A lawyer conducts research on legal issues and is qualified to interpret laws, regulations, and rulings.";
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
	
	public void addHoursWorked(int hours)
	{
		workedHours += hours;
	}
	
	public int getHoursWorked()
	{
		return workedHours;
	}
	
	public String toString()
	{
		String format = "";
		format += getJobDescription();
		format += "\nLawyer gets paid $" + salary + " a year. ";
		format += "Lawyers are scheduled to work " + scheduledHours + " hours per week. ";
		format += "This lawyer has worked " + workedHours + " hours this week.\n";
		
		return format;
	}
	
}
