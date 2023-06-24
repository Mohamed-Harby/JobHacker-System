package week6.src.task2;

import java.util.Date;

public class StaffMember extends Employee {
    String title;

    public StaffMember(String name,
                       String address,
                       String phone,
                       String email,
                       String office,
                       double salary,
                       Date dateHired,
                       String title) {
        super(name, address, phone, email, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "StaffMember{" +
                "name='" + name + '\'' +
                '}';
    }
}
