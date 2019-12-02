//Created by Peter Hoang
public class Secretary implements Employee {

    private int salary;
    private int scheduledHours;
    private int workedHours;

    Secretary()
    {
        salary = 43507;
        scheduledHours = 30;
        workedHours = 0;
    }
    
    public int getSalary() { return salary; }
    public int getWeeklyHours() { return scheduledHours; }
    public int getHoursWorked() { return workedHours; }
    public void addHoursWorked(int hours) { workedHours += hours; }
    public void removeHoursWorked(int hours) throws IllegalArgumentException {
        if (workedHours - hours < 0)
            throw new IllegalArgumentException("Hours worked cannot be negative");
        workedHours -= hours;
    }
    public String getJobDescription() {
        return "A secretary is a person employed by an individual or in an office to assist with correspondence, keep records, make appointments, and carry out similar tasks.";
    }

    public String toString()
    {
        String format = "";
        format += getJobDescription();
        format += "\nSecretary gets paid $" + salary + " a year. ";
        format += "Secretaries are scheduled to work " + scheduledHours + " hours per week. ";
        format+= "This secretary has worked " + workedHours + " hours this week. \n";
        return format;
    }

    

}