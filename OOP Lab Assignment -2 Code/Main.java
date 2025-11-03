public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new Manager(101, "Sazzad", 8000, 8000);
        employees[1] = new Developer(102, "Rizon", 6000, 6000);
        employees[2] = new Employee(103, "Tasnia", 5000);

        System.out.println();
        System.out.println("Manager Salary Calculated: " + employees[0].calculateSalary());
        System.out.println("Developer Salary Calculated: " + employees[1].calculateSalary());
        System.out.println();

        System.out.println("Employee Details:");
        for (Employee emp : employees) {
            System.out.println("ID: " + emp.getEmpId()
                    + " | Name: " + emp.getName()
                    + " | Company: " + Employee.COMPANY_NAME
                    + " | Salary: " + emp.calculateSalary());
        }

        System.out.println();
        System.out.println("Total Employees: " + Employee.getTotalEmployees());
    }
}
