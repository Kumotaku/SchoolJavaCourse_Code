/*使用Date类中的方法，编程实现从1949年10月1日至2016年8月15日之间相隔的天数。*/

package Exercise_1_ClassDate;

import java.util.Date;

public class Main_ClassDate {
    public static void main(String[] args) {
        Date date_1 = new Date(1949-1900, 10-1, 1);
        Date date_2 = new Date(2016-1900, 8-1, 15);
        System.out.println((date_2.getTime()-date_1.getTime())/(24*3600*1000));
    }
}