
package javaapplication56;

public class FullTimeEmployee extends Employee{
    private double basic;
    private double allowance;

    public FullTimeEmployee(String name, int age, String address, String department, String designation, double basic, double allowance) {
        super(name, age, address, department, designation);
        this.basic = basic;
        this.allowance = allowance;
    }

    public double getBasic() {
        return basic;
    }

    public double getAllowance() {
        return allowance;
    }

    public double salary() {
        return basic + (allowance / 100) * basic;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\nSalary: $" + salary();
    }
}
