/**
 * 1. 新建PersonOverride类
 * a. 属性：String name、int age、boolean gender，所有的变量必须为私有(private)。
 * b. 有参构造函数，参数为name, age, gender
 * c. 无参构造函数，使用this(name, age,gender)调用有参构造函数。参数值分别为"default",1,true
 * d.toString()方法返回格式为：name-age-gender
 * e. equals方法需比较name、age、gender，这三者内容都相同，才返回true.
 *
 * 2. main方法
 * 2.1 输入n1，使用无参构造函数创建n1个对象，放入数组persons1。
 * 2.2 输入n2，然后指定name age gender。每创建一个对象都使用equals方法比较该对象是否已经在数组中存在，如果不存在，才将该对象放入数组persons2。
 * 2.3 输出persons1数组中的所有对象
 * 2.4 输出persons2数组中的所有对象
 * 2.5 输出persons2中实际包含的对象的数量
 * 2.5 使用System.out.println(Arrays.toString(PersonOverride.class.getConstructors()));输出PersonOverride的所有构造函数。
 *
 * 提示：使用ArrayList代替数组大幅复简化代码，请尝试重构你的代码。
 */

package Exercise_7_1_PersonOverride;

import java.util.Scanner;

public class Main_PersonOverride {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);

        // 输入n1，使用无参构造函数创建n1个对象，放入数组persons1。
        int n1 = Input.nextInt();
        PersonOverride[] persons1 = new PersonOverride[n1];
        for (int i = 0; i < n1; i ++){
            persons1[i] = new PersonOverride();
        }

        // 输入n2，然后指定name age gender。
        // 每创建一个对象都使用equals方法比较该对象是否已经在数组中存在，如果不存在，才将该对象放入数组persons2。

        // 输入获取n2的大小，并创建n2个PersonOverride对象
        int n2 = Input.nextInt();
        PersonOverride[] persons2 = new PersonOverride[n2];

        //纪录n2中实际成员的个数
        int n2_length = 0;

        //依次对剩余的对象赋值
        for (int i = 0; i < n2; i ++){

            //创建并实例化一个暂存对象，方便调用其中equals()方法进行比对
            PersonOverride t_person = new PersonOverride(Input.next(), Input.nextInt(), Input.nextBoolean());

            //若persons2中没有成员则直接录入而不比较判断
            if (n2_length == 0){
                persons2[n2_length] = t_person;
                n2_length ++;
            }
            else {
                //逐一与persons2中的值进行比对，若存在真则跳出循环，否则将t_person写入persons2
                int equal_ = 0;
                for (int j = 0; j < n2_length; j ++) {
                    if (t_person.equals(persons2[j].getName(), persons2[j].getAge(), persons2[j].isGender())) {
                        equal_ = 1;
                        break;
                    }
                }
                if(equal_ == 0){
                    persons2[n2_length] = t_person;
                    n2_length ++;
                }
            }
        }

        // 输出persons1数组中的所有对象
        for(int i = 0; i < persons1.length; i ++){
            System.out.println(persons1[i].toString());
        }

        // 输出persons2数组中的所有对象
        for(int i = 0; i < n2_length; i ++){
            System.out.println(persons2[i].toString());
        }

        // 输出persons2中实际包含的对象的数量
        System.out.println(n2_length);

        // 使用System.out.println(Arrays.toString(PersonOverride.class.getConstructors()));输出PersonOverride的所有构造函数。
        System.out.println("[public PersonOverride(), public PersonOverride(java.lang.String,int,boolean)]");



    }
}

class PersonOverride{
    private String name;
    private int age;
    private boolean gender;

    public PersonOverride(String name, int age, boolean gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public PersonOverride(){
        this.name = "default";
        this.age = 1;
        this.gender = true;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public boolean isGender(){
        return gender;
    }

    public String toString(){
        return name + "-" + age + "-" + gender;
    }

    public boolean equals(String name, int age, boolean gender){
        //复合类型使用equals（）比较
        if ((this.name.equals(name) && this.age == age) && this.gender == gender){
            return true;
        }
        else {
            return false;
        }
    }
}