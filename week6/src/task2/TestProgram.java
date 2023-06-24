package week6.src.task2;

import java.util.Date;

public class TestProgram {
    public static void main(String[] args) {
        Date date = new Date(); // Current date

        Person person = new Person("Mohamed Badea", "53 st", "555-1234-999", "john.doe@example.com");
        Student student = new Student("Amr Senblo", "56 st", "555-5678-999", "jane.smith@example.com", Student.STATUS_JUNIOR);
        Employee employee = new Employee("Michael Soliman", "79 st", "555-9012-999", "robert.johnson@example.com", "Office 5", 3000.0, date);
        FacultyMember faculty = new FacultyMember("Mohamed Medhat", "321 st", "555-3456-999", "susan.lee@example.com", "Office 14", 2000.0, date, "7AM - 10PM", "Professor");
        StaffMember staff = new StaffMember("Mohamed Reda", "64 st", "555-7890-999", "michael.brown@example.com", "Office 303", 1000.0, date, "Assistant");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}