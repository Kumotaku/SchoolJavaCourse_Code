/**设计一个名为Person的类和它的两个名为Student和Employee子类。Employee类又有子类：教员类Faculty 和 职员类Staff。
 * 每个人都有姓名、地址、电话号码和电子邮件地址。
 * 学生有班级状态(大一、大二、大三或大四)。将这些状态定义为常量。
 * 一个雇员有办公室、工资和受聘日期。
 * 定义一个名为MyDate的类，包含数据域：year (年)、month (月)和day (日)。
 * 教员有办公时间和级别。职员有职务称号。
 * 覆盖每个类中的toString方法，显示相应的类名和人名。
 * 编写一个测试程序。创建Person、Student、Employee、Faculty、和Staff。并且调用它们的toString（）方法。
 */

package Exercise_3_Person;

public class Main_Person {
    public static void main(String[] args){
        Person person = new Person
                ("Person", "AD_1", "86-11111", "Person@nmsl.sm");
        Student student = new Student
                ("Student", "AD_2", "86-22222", "Student@nmsl.sm",
                "Grade One");
        Employee employee = new Employee
                ("Employee", "AD_3", "86-33333", "Employee@nmsl.sm",
                "Fz303", 3333, new MyDate("2018", "10", "28"));
        Faculty faculty = new Faculty
                ("Faculty", "AD_4", "86-44444", "Faculty@nmsl.sm",
                "Fz404", 4444, new MyDate("2018", "10", "28"),
                "7：00-19：00", "Level-Faculty");
        Staff staff = new Staff
                ("Staff", "AD_5", "86-55555", "Stuff@nmsl.sm",
                "Fz505", 5555, new MyDate("2018", "10", "28"),
                "Duty-Stuff");

        System.out.println(person + "\n" +
                student + ", " + student.getGrade() + "\n" +
                employee + ", " + employee.getEmployee() + "\n" +
                faculty + ", " + faculty.getEmployee() + ", " + faculty.getFaculty() + "\n" +
                staff + ", " + staff.getEmployee() + ", " + staff.getStuff());
    }
}

/* Class MyDate */
class MyDate{
    private String year, month, day;

    public MyDate(String year, String month, String day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getDate(){
        return year + "-" + month + "-" + day;
    }
}

/* 父类 Person */
class Person{
    private String name, address, phone, email;

    // Person 的构造方法
    public Person(String name, String address, String phone, String email){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    // Person 的对外传递方法
    public String toString(){
        return "Name: " + name + ", Address: " + address + ", Phone: " + phone + ", E-mail: " + email;
    }
}

/* 父类 Person 的子类 Student */
class Student extends Person{
    private String grade;

    // Student 的构造方法
    public Student(String name, String address, String phone, String email,
                   String grade) {
        super(name, address, phone, email);
        this.grade = grade;
    }

    // Student 的对外传递 Grade 的方法
    public String getGrade(){
        return "Grade: " + grade;
    }
}

/* 父类 Person 的子类 Employee */
class Employee extends Person{
    private String office;
    private double salary;
    private MyDate inviteDate;

    //Employee 的构造方法
    public Employee(String name, String address, String phone, String email,
                    String office, double salary, MyDate inviteDate) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.inviteDate = inviteDate;
    }

    public String getEmployee(){
        return "Office: " + office + ", Salary: " + salary + ", Invite Date: " + inviteDate.getDate();
    }
}

/* 父类 Employee 的子类 Faculty */
class Faculty extends Employee{
    private String workTime, level;

    //Faculty 的构造方法
    public Faculty(String name, String address, String phone, String email,
                   String office, double salary, MyDate inviteDate, String workTime, String level) {
        super(name, address, phone, email, office, salary, inviteDate);
        this.workTime = workTime;
        this.level = level;
    }

    //Faculty 的对外传递方法
    public String getFaculty(){
        return "Work Time: " + workTime + ", Level: " + level;
    }
}

/* 父类 Employee 的子类 Staff */
class Staff extends Employee{
    private String duty;

    //Staff 的构造方法
    public Staff(String name, String address, String phone, String email,
                 String office, double salary, MyDate inviteDate, String duty) {
        super(name, address, phone, email, office, salary, inviteDate);
        this.duty = duty;
    }

    //Faculty 的对外传递方法
    public String getStuff(){
        return "Duty: " + duty;
    }
}
