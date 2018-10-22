/* 编写一个程序，传给main方法一个字符串，显示字符串中大写字母的个数。*/

package Exercise_7_CountingCaps;

import java.util.Scanner;

public class Main_CountingCaps {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        while (true){
            String Str = Input.nextLine();
            char[] StrList = Str.toCharArray();
            int Account = 0;
            for (int i = 0; i < Str.length(); i ++)
                if(StrList[i] >= 'A' && StrList[i] <= 'Z')
                    Account ++;
            System.out.println("Caps Amount is: " + Account);
        }
    }
}
