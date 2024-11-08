import java.util.ArrayList;

public class EmployeeDirectory {

    ArrayList<Employee> employeesList = new ArrayList<>();

    public void addEmployee(Employee employee){
        employeesList.add(employee);
    }

    public ArrayList<String> getYearsOfExperience(int personnelNumber){
        ArrayList<String> searchedYearsOfExperience = new ArrayList<>();
        for (Employee employee : employeesList){
            if (employee.getPersonnelNumber() == personnelNumber)
                searchedYearsOfExperience.add(employee.getFirstName() + ' ' + employee.getLastName() + ' ' + employee.getYearsOfExperience() + " years");
        }
        return searchedYearsOfExperience;
    }

    public ArrayList<String> getPhoneNumber(String name){
        ArrayList<String> searchedPhoneNumbers = new ArrayList<>();
        for (Employee employee : employeesList){
            if (employee.getFirstName().equals(name))
                searchedPhoneNumbers.add(employee.getFirstName() + ' ' + employee.getLastName() + ' ' + employee.getPhoneNumber());
        }
        return searchedPhoneNumbers;
    }

    public Employee getEmployeeByNumber(int number){
        for (Employee employee : employeesList){
            if (employee.getPersonnelNumber() == number)
                return employee;
        }
        return null;
    }
}
