package ex3;

public class Worker extends Human{
    private double weekSalary;
    private int hoursPerDay;
    private double salaryPerHour;
    public Worker(String firstName, String lastName, double weekSalary, int hoursPerDay, double salaryPerHour) {
        super(firstName, lastName);
        this.setWeekSalary(weekSalary);
        this.setSalaryPerHour(salaryPerHour);
        this.setHoursPerDay(hoursPerDay);
    }

    public double getWeekSalary() {
        return weekSalary;
    }

    public int getHoursPerDay() {
        return hoursPerDay;
    }

    public void setHoursPerDay(int hoursPerDay) {
        this.hoursPerDay = hoursPerDay;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public void setWeekSalary(double weekSalary) throws IllegalArgumentException {
        if(weekSalary > 10 ) {
            this.weekSalary = weekSalary;
        }
        else throw new IllegalArgumentException("\"Expected value mismatch!Argument:\n" +
                "weekSalary");
    }


    @Override
    public String toString() {
        return "First Name: " + getFirstName() + "\n" + "Last Name: " + getLastName() + "\n" + "Week Salary: " + getWeekSalary()+"\n"
                + "Hours per day: " + getHoursPerDay()+"\n" + "Salary per hour: " + getSalaryPerHour();
    }
}
