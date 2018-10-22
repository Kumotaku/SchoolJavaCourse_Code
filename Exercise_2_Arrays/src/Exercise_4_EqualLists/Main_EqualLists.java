/**如果两个数组list1和list2的内容相同，那么就说他们是相同的。
 * 使用下面的方法头编写一个方法，如果list1和list2 是相同的，该方法就返回true：
 * public static boolean equal(int[] list1, int[] list2)
 * 编写一个测试程序，提示用户输入两个整数数列，然后显示他们两个是否相同。
 * 第一个输入的数表示数列中元素的个数。 */
package Exercise_4_EqualLists;

import java.util.Scanner;
import java.util.Arrays;

public class Main_EqualLists {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        while(true){
            int list1_account = Input.nextInt();
            int[] list1 = new int[list1_account];
            for(int i = 0; i < list1_account; i ++)
                list1[i] = Input.nextInt();

            int list2_account = Input.nextInt();
            int[] list2 = new int[list2_account];
            for(int i = 0; i < list1_account; i ++)
                list2[i] = Input.nextInt();

            System.out.println(equal(list1, list2));
        }
    }
    public static boolean equal(int[] list1, int[] list2){
        return Arrays.equals(list1, list2);
    }
}
