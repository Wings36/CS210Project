//Created by Peter Hoang
public class Secretary implements Employee {

    private int salary;
    private int scheduledHours;
    private int workedHours;

    public Secretary()
    {
        salary = 43507;
        scheduledHours = 30;
        workedHours = 0;
    }

    public int getSalary() { return salary; }
    public int getWeeklyHours() { return scheduledHours; }
    public int getHoursWorked() { return workedHours; }
    public void addHoursWorked(int hours) { workedHours += hours; }
    public void removeHoursWorked(int hours) { workedHours -= hours; }

    public String getJobDescription() {
        return "a person employed by an individual or in an office to assist with correspondence, keep records, make appointments, and carry out similar tasks.";
    }


}
