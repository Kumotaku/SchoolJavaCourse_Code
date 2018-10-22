import java.util.Scanner;
import java.util.Arrays;

public class Test_intSort {
    public static void main(String[] args) {
        int x_amount;

        Scanner Input=new Scanner(System.in);

        x_amount = Input.nextInt();
        int int_x[] = new int[x_amount];

        for(int i = 0; i < x_amount; i ++)
            int_x[i] = Input.nextInt();

        Arrays.sort(int_x);

        for(int i = 0; i < x_amount; i ++)
            System.out.print(int_x[i] + " ");

        Input.close();
    }
}