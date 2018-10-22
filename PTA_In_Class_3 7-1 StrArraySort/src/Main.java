import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        int Account = Input.nextInt();
        String[] Name = new String[Account];
        for(int i = 0; i < Account ;i ++){
            Name[i] = Input.next();
        }
        Arrays.sort(Name);
        for(int i = 0; i < Account; i ++){
            System.out.println(Name[i]);
        }
    }
}
