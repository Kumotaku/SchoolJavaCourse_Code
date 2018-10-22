/**
 * 创建一个 Data 对象，设置它的流逝时间分别为
 * 10000,  100000, 10000000, 10000000, 100000000, 1000000000, 10000000000, 100000000000，
 * 然后使用 toString( ) 方法显示日期。
 */

package Exercise_3_ToString;

import java.util.Date;

public class Main_ToString {
    public static void main(String[] args){
        long[] time = {10000, 100000, 10000000, 10000000, 100000000, 1000000000, 10000000000L, 100000000000L};
        for(int i = 0; i < 8; i ++){
            Date timeStr = new Date(time[i]);
            System.out.println(timeStr.toString());
        }
    }
}
