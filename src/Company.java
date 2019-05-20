public class Company {
    private String name;
    private String address;
    private String phone;
    private Employee [] employees;

    public Company(String name, String address, String phone, Employee[] employees) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.employees = employees;
    }

    public void printMaxSalaryEmployeeName() {
        long max = 0;
        String maxSalaryEmployeeName = "";
        for (Employee employee : employees) {
            if (employee.getSalary() == max) {
                maxSalaryEmployeeName = maxSalaryEmployeeName + "," + employee.getName();
            }
            if (employee.getSalary() > max) {
                max = employee.getSalary();
                maxSalaryEmployeeName = employee.getName();
            }

        }
        System.out.println(maxSalaryEmployeeName);
    }
}
