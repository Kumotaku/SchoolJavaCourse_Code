/**
 * 设计雇员Employee类，记录雇员的情况，包括姓名、年薪、受雇时间，
 * 要求定义MyDate类作为受雇时间，其中包括工作的年、月、日，并用相应的方法对Employee类的成员变量进行设置。
 * 编写测试类Test测试Employee类。要求使用自己的包。
 */
package Exercise_6_Employee;

public class Main_Employee {
    public static void main(String[] args){
        Employee Employee1 = new Employee("Kumotaku", 2000000, new MyDate("2018", "10", "09"));
        Employee Employee2 = new Employee("Mobei", 3000000, new MyDate("2017", "07", "22"));

        Employee1.PrintInfo();
        Employee2.PrintInfo();
    }
}

class Employee{
    private String m_Name;
    private double m_Salary;
    private MyDate m_HireDay;

    public Employee(String Name, double Salary, MyDate HireDay) {
        m_Name = Name;
        m_Salary = Salary;
        m_HireDay = HireDay;
    }

    public void PrintInfo() {
        System.out.println(m_Name + "\t" + m_Salary + "\t" + HireDay());
    }

    public String HireDay() {
        return m_HireDay.PrintDate();
    }
}

class MyDate {
    private String m_Year;
    private String m_Month;
    private String m_Day;

    public MyDate(String Year, String Month, String Day){
        m_Year = Year;
        m_Month = Month;
        m_Day = Day;
    }

    public String PrintDate(){
        return m_Year + "-" + m_Month + "-" + m_Day;
    }
}
