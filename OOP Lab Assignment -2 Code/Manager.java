public class Manager extends Employee {
    private double performanceBonus;

    public Manager(int empId, String name, double basicSalary, double performanceBonus) {
        super(empId, name, basicSalary);
        this.performanceBonus = performanceBonus;
    }

    @Override
    public double calculateSalary() {
        return getBasicSalary() + performanceBonus;
    }
}
