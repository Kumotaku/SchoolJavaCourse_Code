/**提示用户输入学生人数、学生姓名和他们的分数，并按分数的递减顺序打印学生姓名。 */
package Exercise_3_StudentsNameSort;
import java.util.Scanner;

class Student{
    public String Name;
    public int Grade;
}

public class Main_StudentsNameSort {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        while(true){
            System.out.print("Enter student account: ");
            int Stu_account = Input.nextInt();
            Student[] Stu = new Student[Stu_account];
            for(int i = 0; i < Stu_account; i ++)
                Stu[i] = new Student();

            System.out.println("Enter students' names and grades in turn:");
            for(int i = 0; i < Stu_account; i ++){
                Stu[i].Name = Input.next();
                Stu[i].Grade = Input.nextInt();
            }

            String tp_Name;
            int tp_Grade;
            for(int i = 0; i < Stu_account; i ++)
                for(int j = i + 1; j < Stu_account; j ++)
                    if(Stu[i].Grade < Stu[j].Grade) {
                        tp_Name = Stu[i].Name;
                        tp_Grade = Stu[i].Grade;
                        Stu[i].Name = Stu[j].Name;
                        Stu[i].Grade = Stu[j].Grade;
                        Stu[j].Name = tp_Name;
                        Stu[j].Grade = tp_Grade;
                    }

            for(int i = 0; i < Stu_account; i ++)
                System.out.println(Stu[i].Name + " " +Stu[i].Grade);
        }
    }
}