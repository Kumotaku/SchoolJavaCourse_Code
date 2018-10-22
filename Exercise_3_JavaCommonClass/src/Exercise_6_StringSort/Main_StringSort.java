/**
 * 使用下面的方法头编写一个方法，返回排好序的字符串：
 * public static String sort(String s)
 */

package Exercise_6_StringSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main_StringSort {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        while(true){
            String Str = Input.nextLine();
            System.out.println(sort(Str));
        }
    }

    public static String sort(String s){
        char[] StrList = s.toCharArray();
        Arrays.sort(StrList);
        String Str = new String(StrList);
        return Str;
    }
}
