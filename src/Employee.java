//interface by Dien Nguyen

public interface Employee {
	public int getSalary();
	public String getJobDescription();
	public int getWeeklyHours(); //this is hours scheduled to work for
	public int getHoursWorked(); //actual hours worked
	public void addHoursWorked(int hours);
	public void removeHoursWorked(int hours);
	public String toString();
}
