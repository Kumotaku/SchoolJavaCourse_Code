/**改写下列程序中的Course类。
 * 使用ArrayList代替数组来存储学生。
 * 不应该改变Course类的原始合约(即构造方法和方法的定义都不应该改变)。
 */

package Exercise_4_Course;

import java.util.ArrayList;

public class Main_Course {
    public static void main(String[] args){
        Course course1 = new Course("Java Programming");
        Course course2 = new Course("Computer Science");

        course1.addStudents("Kumotaku");
        course1.addStudents("Mobei");
        course1.addStudents("Susars");

        course2.addStudents("XTStarry");
        course2.addStudents("Ainro");

        System.out.println("Number of students in " + course1.getCourseName() +
                " is " + course1.getNumberOfStudents() + " and they are: \n" + course1.students);
        System.out.println("Number of students in " + course2.getCourseName() +
                " is " + course2.getNumberOfStudents() + " and they are: \n" + course2.students);

        course1.students.clear();
        course2.students.clear();
        System.out.println("清除course1，course2 中的学生后两门课程中人数分别为" +
                course1.getNumberOfStudents() + "人，"+
                course2.getNumberOfStudents() + "人。");
    }
}

class Course {
    private String courseName;
    //改写数组的创建方法
    ArrayList<String> students = new ArrayList<>();

    public Course(String courseName){
        this.courseName = courseName;
    }

    //修改添加元素的方法：使用ArrayList方法修改掉数组方法
    public void addStudents(String student){
        students.add(student);
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public int getNumberOfStudents(){
        return students.size();
    }

    public String getCourseName(){
        return courseName;
    }

    //JAVA 动态拓展数组 落实dropStudent 新增clear() 清除所有元素（学生）的功能
    public void dropStudent(String student) {
        // Left as an exercise in Exercise 9.9
        students.remove(student);
    }

    public void clear(){
        students.clear();
    }
}

