public class SalaryEmployee extends Employee {
    private double weeklySalary;

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary >=0)
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double calculatePay() {

        return weeklySalary;
    }
}
