package Exercise_7_2_PersonStudentEmployeeCompany;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

class Person2{
    String name;
    int age;
    boolean gender;

    public Person2(String name, int age, boolean gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String toString(){
        return name+"-"+age+"-"+gender;
    }
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if(obj==null)
            return false;
        if(!(obj instanceof Person2))
            return false;
        Person2 person = (Person2)obj;
        if(!this.name.equals(person.name))
            return false;
        if(this.age!=person.age)
            return false;
        if(this.gender!=person.gender)
            return false;
        return true;

    }

}

class Student extends Person2{
    String stuNo;
    String clazz;



    public Student(String name, int age, boolean gender,String stuNo,String clazz) {
        super(name, age, gender);
        this.stuNo = stuNo;
        this.clazz = clazz;

    }

    public String toString(){
        return "Student:"+super.toString()+"-"+stuNo+"-"+clazz;
    }
    public boolean equals(Object obj){
        if(super.equals(obj)==false)
            return false;
        if(this==obj)
            return true;
        if(obj==null)
            return false;
        if(!(obj instanceof Student))
            return false;
        Student s = (Student)obj;
        if(!this.stuNo.equals(s.stuNo))
            return false;
        if(!this.clazz.equals(s.clazz))
            return false;
        return true;
    }

}

class Company{
    String name;
    public Company(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if(obj==null)
            return false;
        if(!(obj instanceof Company))
            return false;
        Company c =(Company)obj;
        if(this.name.equals(c.name))
            return true;
        return false;
    }
}

class Employee extends Person2{
    Company company;
    double salary;

    public Employee(String name, int age, boolean gender,double salary,Company company) {
        super(name, age, gender);
        this.salary = salary;
        this.company = company;
        // TODO Auto-generated constructor stub
    }
    public String toString(){
        return "Employee:"+super.toString()+"-"+company+"-"+salary;
    }
    public boolean equals(Object obj){
        if(super.equals(obj)==false){
            //System.out.println("sup,unequal");
            return false;
        }

        if(this==obj){
            //System.out.println("this,unequal");
            return false;
        }

        if(obj==null){
            //System.out.println("null,unequal");
            return false;
        }

        if(!(obj instanceof Employee)){
            //System.out.println("lei,unequal");
            return false;
        }

        Employee e = (Employee)obj;
        if(!this.company.equals(e.company)){
            //System.out.println("com,unequal");
            return false;
        }

        DecimalFormat df = new DecimalFormat("#.#");
        String a = df.format(this.salary);
        double a1 = Double.parseDouble(a);
        String b = df.format(e.salary);
        double b1 = Double.parseDouble(b);
        //System.out.println(df.format(this.salary));

        //System.out.println(df.format(e.salary));
        if(a1!=b1)
        {
            //System.out.println("qian,unequal");
            return false;
        }

        return true;

    }

}


/*interface Compartor<Person2>{
	public int compare(Object obj1,Object obj2);
}
*/
public class Main {


    static class NAComparator implements Comparator{

        public int compare(Object obj1,Object obj2) {
            Person2 p1 = (Person2)obj1;
            Person2 p2 = (Person2)obj2;
            if(p1.name.compareTo(p2.name)==0){
                if(p1.age>p2.age)
                    return 1;
                else if(p1.age<p2.age)
                    return -1;
                else
                    return 0;
            }

            return p1.name.compareTo(p2.name);
        }
    }
    public static void main(String[] args) {
        int flag = 0;
        List<Person2> personList = new ArrayList<Person2>();
        List<Student> stuList = new ArrayList<Student>();
        List<Employee> empList = new ArrayList<Employee>();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        while(a.equals("s")||a.equals("e")){
            switch (a) {
                case "s":
                    Student s = new Student(sc.next(),sc.nextInt(),sc.nextBoolean(),sc.next(),sc.next());
                    personList.add(s);
                    a=sc.next();
                    break;
                case "e":
                    Company c;
                    Employee e = new Employee(sc.next(),sc.nextInt(),sc.nextBoolean(),sc.nextDouble(),c = new Company(sc.next()));
                    personList.add(e);
                    a=sc.next();
                    break;

            }
        }
        Collections.sort(personList,new NAComparator());
        //Arrays.sort(personList.toString());
        for(int i=0;i<personList.size();i++){

            System.out.println(personList.get(i).toString());
        }
        //System.out.println(((Student)personList.get(3)).equals((Student)(personList.get(4))));

        if(!sc.next().equals("exit")){
            for(int i=0;i<personList.size();i++){
                //System.out.println("2");
                if((personList.get(i) instanceof Student)==true){
                    for(int j=0;j<stuList.size();j++){
                        if(((Student)personList.get(i)).equals((stuList.get(j))) ==true){
                            flag=1;
                            break;

                        }


                    }
                    if(flag==0){
                        stuList.add((Student)personList.get(i));

                    }
                    else
                        flag=0;
                }

                else{
                    for(int j=0;j<empList.size();j++){
                        if(((Employee)personList.get(i)).equals((empList.get(j))) ==true){

                            flag=1;
                            break;
                        }


                    }
                    if(flag==0)
                        empList.add((Employee)personList.get(i));
                    else
                        flag=0;
                    //empList.add((Employee)personList.get(i));

                }


            }
            System.out.println("stuList");
            for(int i=0;i<stuList.size();i++)
                System.out.println(stuList.get(i).toString());
            System.out.println("empList");
            for(int i=0;i<empList.size();i++)
                System.out.println(empList.get(i).toString());

        }

    }

}