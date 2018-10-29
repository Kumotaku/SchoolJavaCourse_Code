/**改写下列程序中的Course类。
 * 使用ArrayList代替数组来存储学生。
 * 不应该改变Course类的原始合约(即构造方法和方法的定义都不应该改变)。
 */

package Exercise_4_Course;

public class Main_Course {
    public static void main(){

    }
}

class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(String student){
        students[numberOfStudents] = student;
        numberOfStudents ++;
    }

    public String[] getStudents(){
        return students;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    public String getCourseName(){
        return courseName;
    }

    public void dropStudent(String student){}
}

