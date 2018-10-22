/**设在数组a中存有10个整数，从键盘输入一个数，检查该数是否在数组中，
 * 若在数组中，则输出该数在数组中的位置，若在数组中未找到该数，则输出“Not Found！”信息。 */
package Exercise_2_ArraySearch;

import java.util.Scanner;
import java.util.Arrays;

public class Main_ArraySearch {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        while(true){
            int[] x = new int[10];

            System.out.println("Enter ten integer numbers: ");
            for(int i = 0; i<10; i ++)
                x[i] = Input.nextInt();

            System.out.print("Enter an integer number to search: ");
            int index = Arrays.binarySearch(x, Input.nextInt());
            if(index>=0)
                System.out.println("The index is " + index);
            else
                System.out.println("Not Found！");
        }
    }
}