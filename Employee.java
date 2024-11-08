public class Employee {

    String firstName;
    String lastName;
    int personnelNumber;
    String phoneNumber;
    int yearsOfExperience;

    public Employee(String firstName, String lastName, int personnelNumber, String phoneNumber, int yearsOfExperience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personnelNumber = personnelNumber;
        this.phoneNumber = phoneNumber;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPersonnelNumber() {
        return personnelNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    @Override
    public String toString() {
        return firstName + ' ' +
                lastName + ' ' +
                '№' + personnelNumber + ' ' +
                phoneNumber + ' ' +
                yearsOfExperience + " years";
    }
}
