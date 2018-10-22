import java.util.Scanner;

public class TestApple {
    public static void main(String[] args){
        int AppleAmount;
        int BodyHeight;
        int AppleCatchable = 0;

        Scanner Input = new Scanner(System.in);

        AppleAmount = Input.nextInt();
        int[] AppleHeight = new int[AppleAmount];

        for(int i = 0; i < AppleAmount; i ++)
            AppleHeight[i] = Input.nextInt();

        BodyHeight = Input.nextInt() + 30;

        for(int i = 0; i < AppleAmount; i ++)
            if(AppleHeight[i] <= BodyHeight)
                AppleCatchable ++;

        System.out.println(AppleCatchable);

        Input.close();
    }
}