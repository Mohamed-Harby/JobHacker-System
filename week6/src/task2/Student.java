package week6.src.task2;

public class Student extends Person {
    String classStatus;
    public static final String STATUS_FRESHMAN = "Freshman";
    public static final String STATUS_SOPHOMORE = "Sophomore";
    public static final String STATUS_JUNIOR = "Junior";
    public static final String STATUS_SENIOR = "Senior";

    public Student(String name, String address, String phone, String email, String classStatus) {
        super(name, address, phone, email);
        this.classStatus = classStatus;
    }

    public String getClassStatus() {
        return classStatus;
    }

    public void setClassStatus(String classStatus) {
        this.classStatus = classStatus;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
