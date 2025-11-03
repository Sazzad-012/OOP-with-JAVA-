public class Employee {
    private int empId;
    private String name;
    private double basicSalary;

    public static final String COMPANY_NAME = "TechNova Pvt. Ltd.";
    private static int totalEmployees = 0;

    public Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        setName(name);
        setBasicSalary(basicSalary);
        totalEmployees++;
        System.out.println("Employee created at " + COMPANY_NAME + ".");
    }

    // Setters and conditional logic
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name!");
        }
    }

    public void setBasicSalary(double basicSalary) {
        if (basicSalary < 10000) {
            System.out.println("Invalid salary! Setting basic salary to 10000.0");
            this.basicSalary = 10000.0;
        } else {
            this.basicSalary = basicSalary;
        }
    }

    // Getters
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }

    public double calculateSalary() {
        return basicSalary;
    }

    public static void displayCompanyName() {
        System.out.println(COMPANY_NAME);
    }
}
