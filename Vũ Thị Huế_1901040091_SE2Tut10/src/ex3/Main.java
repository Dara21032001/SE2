package ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lasName = scanner.nextLine();
        int studentID = scanner.nextInt();
        double weekSalary = scanner.nextDouble();
        int hoursPerDay = scanner.nextInt();
        double salaryPerHour = scanner.nextDouble();
        Student student = new Student(firstName, lasName, studentID);
        System.out.println(student.toString());

        Worker worker = new Worker(firstName, lasName, weekSalary, hoursPerDay, salaryPerHour);

        System.out.println(worker.toString());
    }
}
