package 面向对象.实验5;

public class Student extends Personal{
    private int studentID;
    private String department;
    private String grade;

    public Student(int id, String name, int age, String sex, int studentID, String department, String grade) {
        super(id, name, age, sex);
        this.studentID = studentID;
        this.department = department;
        this.grade = grade;
    }

    public Student(int studentID, String department, String grade) {
        this.studentID = studentID;
        this.department = department;
        this.grade = grade;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return super.toString()+
                "Student{" +
                "studentID=" + studentID +
                ", department='" + department + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
    public String getInfo(){
        return toString();
    }
    public void print(){
        System.out.println(getInfo());
    }
}

