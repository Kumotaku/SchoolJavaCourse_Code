/**编程完成一维数组的排序。 */
package Exercise_1_ArraySort;

import java.util.Scanner;
import java.util.Arrays;

public class Main_ArraySort {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        while(true) {
            int x_amount = Input.nextInt();
            int x[] = new int[x_amount];

            for (int i = 0; i < x_amount; i++)
                x[i] = Input.nextInt();

            Arrays.sort(x);

            for (int i = 0; i < x_amount; i++)
                System.out.print(x[i] + " ");
            System.out.print("\n");
        }
    }
}
