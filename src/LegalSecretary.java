//designed and coded by Dien Nguyen

public class LegalSecretary extends Secretary {
	
	
	public LegalSecretary()
	{
		super();
	}
	
	public int getSalary()
	{
		return super.getSalary() + 1493;
	}
	
	public int getWeeklyHours()
	{
		return super.getWeeklyHours() + 10;
	}
	
	public String getJobDescription()
	{
		return "Legal secretaries work in law offices and perform secretarial tasks that are specific to the law field: "
				+ "writing legal documents, such as summonses, motions, subpoenas, etc., conducting research and reading legal articles, "
				+ "and more, as well as standard secretarial duties, that might include answering phones and email, filing, creating and "
				+ "maintaining schedules for lawyers, ordering supplies, copying, faxing and maintaining the office.";
	}
	
	public String toString()
	{
		String format = "";
		format += getJobDescription();
		format += "\nLegal secretaries gets paid $" + getSalary() + " a year. ";
		format += "Legal secretaries are scheduled to work " + getWeeklyHours() + " hours per week. ";
		format += "This legal secretary has worked " + super.getHoursWorked() + " hours this week.\n";
		
		return format;
	}
	
}
