 /**创建一个有10个账户的数组，其id为0，1，…，9，并初始化收支为100美元。
 * 系统提示用户输入一个id，就显示如运行示例所示的主菜单。
 * 可以选择1来查看当前的收支，选择2表示取钱，选择3表示存钱，选择4表示退出主菜单。
 * 一旦退出，系统就会提示再次输入id。
 */
package Exercise_5_ATMSystem;

import java.util.Scanner;

class Account {
    public int Acc_id;
    public int Acc_balance;
}

public class Main_ATMSystem {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        Account[] acc = new Account[10];
        for(int i = 0; i < 10; i ++){
            acc[i] = new Account();
            acc[i].Acc_id = i;
            acc[i].Acc_balance = 100;
        }

        while(true){
            System.out.print("Enter an id: ");
            int AccountChoice = Input.nextInt();

            boolean judge = true;
            while (judge){
                System.out.print("Mine menu:\n" +
                        "\t1: check balance\n" +
                        "\t2: withdraw\n" +
                        "\t3: deposit\n" +
                        "\t4: exit\n" +
                        "Enter a choice: ");

                switch (Input.nextInt()){
                    case 1:
                        System.out.println("The balance is: " + acc[AccountChoice].Acc_balance);
                        break;
                    case 2:
                        System.out.print("Withdrawing. Input money: ");
                        acc[AccountChoice].Acc_balance -= Input.nextInt();
                        System.out.println("Completed! Now your balance is: " + acc[AccountChoice].Acc_balance);
                        break;
                    case 3:
                        System.out.print("depositing. Input money: ");
                        acc[AccountChoice].Acc_balance += Input.nextInt();
                        System.out.println("Completed! Now your balance is: " + acc[AccountChoice].Acc_balance);
                        break;
                    case 4:
                        judge = false;
                        break;
                    default:
                        System.out.println("Please enter right choice.");
                }
                System.out.println();
            }
        }
    }
}

