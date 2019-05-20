public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee(  "Ivan", "1232", 10000);
        Employee employee2 = new Employee(  "Igor",  "14545",  10000);
        Employee employee3 = new Employee(  "Dmytro",  "555",  2000);
        Company gl= new Company( "GL",  "Hrinchenka", "4545", new Employee[] {employee1, employee2, employee3});
        gl.printMaxSalaryEmployeeName();
    }
}
