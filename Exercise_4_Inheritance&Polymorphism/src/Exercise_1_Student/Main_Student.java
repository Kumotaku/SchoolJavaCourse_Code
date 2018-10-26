/**
 * 设计一个学生类Student，其属性有姓名、年龄和学位。
 * 从Student类继承产生本科生类和研究生类，本科生增加专业属性，研究生增加研究方向属性。
 * 每个类都有显示方法，用于输出属性信息。
 */

package Exercise_1_Student;

public class Main_Student {
    public static void main(String[] args){
        Undergraduate stu1 = new Undergraduate("Kumotaku", 15, "Undergraduate", "CS");
        Graduate stu2 = new Graduate("Mobei", 17, "Graduate", "Alchemist");
        stu1.Print();
        stu2.Print();
    }
}

//抽象类父类Student
//抽象类只能被继承，不可被实例化
abstract class Student{
    private int age;
    private String name;
    private String degree;

    //Student的构造函数
    public Student(String name, int age, String degree){
        this.age = age;
        this.name = name;
        this.degree = degree;
    }

    //打印类Student中的成员信息
    public void Print(){
        System.out.println("Name: " + name + "\nAge: " + age + "\nDegree: " + degree);
    }
}

//继承父类Student的“大学生”子类Undergraduate
class Undergraduate extends Student{
    //包含一个私有成员：专业属性
    private String MajorAttributes;

    //构造父类及子类
    public Undergraduate(String name, int age, String degree, String attribute) {
        /*针对父类使用super(parameter1,parameter2,parameter3...)*/
        super(name, age, degree);
        this.MajorAttributes = attribute;
    }

    //打印父类及子类中的成员信息
    public void Print(){
        super.Print();
        System.out.println("Major Attributes: " + MajorAttributes + "\n");
    }
}

//继承父类Student的“研究生”子类Graduate
class Graduate extends Student{
    //包含一个私有成员：研究方向
    private String ResearchDirection;

    //构造父类及子类
    public Graduate(String name, int age, String degree, String attribute) {
        super(name, age, degree);
        this.ResearchDirection = attribute;
    }

    //打印父类及子类中的成员信息
    public void Print(){
        super.Print();
        System.out.println("Research Direction：" + ResearchDirection + "\n");
    }
}