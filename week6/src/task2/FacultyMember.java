package week6.src.task2;

import java.util.Date;

public class FacultyMember extends Employee {
    String officeHours;
    String rank;

    public FacultyMember(String name, String address, String phone, String email, String office, double salary, Date dateHired, String officeHours, String rank) {
        super(name, address, phone, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "FacultyMember{" +
                "name='" + name + '\'' +
                '}';
    }
}

//class TestEmployee {
//    public static void main(String[] args) {
//        System.out.println(new Employee(
//                "ahmed",
//                "amr 123",
//                "010",
//                "moharby@gf.com",
//                "harby office",
//                9999999999.9,
//                new Date()).toString());
//    }
//}