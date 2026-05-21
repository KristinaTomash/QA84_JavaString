public class HourlyEmployee extends Employee{

    private double payRate;
    private double hoursWorked;

    public HourlyEmployee(){}

    public double getPayRate() {
        return payRate;
    }
    public void setPayRate(double payRate) {
        if (payRate >0)
        this.payRate = payRate;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked >=0)
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return payRate * hoursWorked;
    }
}
