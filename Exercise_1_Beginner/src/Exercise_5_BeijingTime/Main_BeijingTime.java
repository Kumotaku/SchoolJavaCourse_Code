/**
 * 定义北京时间类BeijingTime,成员变量有小时、分钟和秒，有三个构造函数和显示时间的方法。
 * 并定义起始类，由构造方法创建3个对象，显示相应的时间。
 */
package Exercise_5_BeijingTime;

import javax.swing.*;
import java.util.Scanner;

public class Main_BeijingTime {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        while(Input.hasNext()) {
            int hour  =Input.nextInt();
            int minute=Input.nextInt();
            int second=Input.nextInt();

            BeijingTime Time = new BeijingTime();
            Time.BeijingTime(hour,minute,second);
            Time.ShowTime();
        }
    }
}

class BeijingTime{
    private int m_Hour;
    private int m_Minute;
    private int m_Second;

    public void BeijingTime(int Hour,int Minute,int Second) {
        m_Hour = Hour;
        m_Minute = Minute;
        m_Second = Second;
    }

    public void ShowTime() {
        if( m_Hour <0| m_Hour >23| m_Minute <0| m_Minute >59| m_Second <0| m_Second >59)
            JOptionPane.showMessageDialog(null,"A Wrong Time Has Been Input.");
            //System.out.println("A Wrong Time Has Been Input.");
        else
            //System.out.println("now BeijingTime is "+ m_Hour +":"+ m_Minute +":"+ m_Second);
            JOptionPane.showMessageDialog(null,"now BeijingTime is "+ m_Hour +":"+ m_Minute +":"+ m_Second);

    }
}
