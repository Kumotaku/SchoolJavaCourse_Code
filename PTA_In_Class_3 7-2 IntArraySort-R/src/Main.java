import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        int Account = Input.nextInt();
        int[] x = new int[Account];
        for(int i = 0; i < Account; i ++){
            x[i] = Input.nextInt();
        }
        Arrays.sort(x);
        for(int i = Account - 1; i >= 0; i --){
            if(i == 0)
                System.out.print(x[i]);
            else
                System.out.print(x[i]+" ");
        }
    }
}
