/**
 * 定义一个学生类Student, * 学生信息包括学号、姓名、年龄、成绩和学校名等状态信息。
 * 创建一个测试类Test，用构造方法创建两个学生对象，存储并输出两个学生的信息，计算并输出这两个学生的平均成绩。
 */
package Exercise_3_Student;

public class Main_Student {

    public static void main(String[] args) {
        Student Kumotaku = new Student("01","Kumotaku",16,76,"XUPT");
        Student Mobei = new Student("02","Mobei",15,94,"XUPT");
        Kumotaku.printInfo();
        Mobei.printInfo();
        double avg=(Kumotaku.getScore()+Mobei.getScore())/2;
        System.out.println("Average Score: " + avg);

    }
}

class Student{

    private String m_number;
    private String m_name;
    private int m_age;
    private int m_score;
    private String m_schoolName;

    public Student(String number,String name,int age,int score,String schoolName){
        m_number = number;
        m_name = name;
        m_age = age;
        m_score = score;
        m_schoolName = schoolName;
    }

    public int getScore() {
        return m_score;
    }

    public void printInfo() {
        System.out.println("NO." + m_number);
        System.out.println("Name: " + m_name);
        System.out.println("Age: " + m_age);
        System.out.println("Score: " + m_score);
        System.out.println("School: " + m_schoolName + "\n");
    }
}
