public class Developer extends Employee {
    private double projectAllowance;

    public Developer(int empId, String name, double basicSalary, double projectAllowance) {
        super(empId, name, basicSalary);
        this.projectAllowance = projectAllowance;
    }

    @Override
    public double calculateSalary() {
        return getBasicSalary() + projectAllowance;
    }
}
