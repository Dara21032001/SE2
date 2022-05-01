package ex3;

public class Student extends Human {
    private int facultyNumber;

    public Student(String firstName, String lastName, int facultyNumber) {
        super(firstName, lastName);
        this.facultyNumber = facultyNumber;
    }

    public int getFacultyNumber() {
        return facultyNumber;
    }

    public void setFacultyNumber(int facultyNumber) {
        this.facultyNumber = facultyNumber;
    }

    @Override
    public String toString() {
        return "First Name: " + getFirstName() + "\n" + "Last Name: " + getLastName() + "\n" + "Faculty Number: " + getFacultyNumber();


    }
}
