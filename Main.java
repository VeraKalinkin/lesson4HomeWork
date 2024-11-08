public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Abc", "Dm", 1, "78654364693", 3);
        Employee employee2 = new Employee("Cfd", "Fc", 2, "78676464693", 2);
        Employee employee3 = new Employee("Dnb", "Bn", 3, "78654389693", 3);
        Employee employee4 = new Employee("Ndt", "Cf", 4, "74534364693", 5);
        Employee employee5 = new Employee("Abc", "Dc", 5, "78656764693", 4);
        Employee employee6 = new Employee("Hbv", "Ng", 6, "78635464693", 3);

        EmployeeDirectory directory = new EmployeeDirectory();
        directory.addEmployee(employee1);
        directory.addEmployee(employee2);
        directory.addEmployee(employee3);
        directory.addEmployee(employee4);
        directory.addEmployee(employee5);
        directory.addEmployee(employee6);

        System.out.println(directory.getPhoneNumber("Abc"));
        System.out.println(directory.getYearsOfExperience(5));
        System.out.println(directory.getEmployeeByNumber(3));
    }
}