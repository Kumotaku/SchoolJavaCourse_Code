/**
 * 写程序，创建一个ArrayList，
 * 然后向这个线性表中添加一个Loan对象、一个Date对象、一个字符串、一个Jframe对象和一个Circle对象，
 * 然后使用循环调用对象的toString（）方法，来显示线性表中所有的元素。
 */
package Exercise_5_ArrayList;

import java.util.ArrayList;

public class Main_ArrayList {
    public static void main(String[] args){
        ArrayList<Object> obj = new ArrayList<>();
        obj.add(new Loan());
        obj.add(new Date());
        obj.add("A String In Arrays.");
        obj.add(new Jframe());
        obj.add(new Circle());

        for (int i = 0; i < 5; i ++){
            System.out.println(obj.get(i).toString());
        }
    }
}

class Loan{
    public String toString() {
        return "A Loan Class In Arrays.";
    }
}

class Date{
    public String toString() {
        return "A Date Class In Arrays.";
    }
}

class Jframe{
    public String toString() {
        return "A Loan Jframe In Arrays.";
    }
}

class Circle{
    public String toString() {
        return "A Circle Class In Arrays.";
    }
}