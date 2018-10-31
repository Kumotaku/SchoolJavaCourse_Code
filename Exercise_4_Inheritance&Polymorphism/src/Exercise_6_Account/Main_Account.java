
package Exercise_6_Account;

import java.util.ArrayList;
import java.util.Date;

public class Main_Account {
    public static void main(String[] args){
        Account account = new Account(1, "Kumotaku", 5000);
        System.out.println(account.toString());

        // 测试：
        account.withDraw(1500);
        account.deposit(2070);

        // 输出单账户存取纪录
        System.out.println("\n\t\t\t Date\t\t\t  Type  Amount\tBalance\t  description" +
                "\n**--------------------------------------------------------------------**");
        for (int i = 0; i < account.length(); i ++){
            System.out.println(account.transactions.get(i).toString());
        }
    }
}

// 添加一个名为transactions的ArrayList类型的新数据域，用于为账户存储交易。
// 每笔交易都是一个Transaction类的实例。Transaction 类的定义如下图所示。
class Transaction{
    /**
     * date         (Date)      交易日期
     * type         (char)      交易类型 "W"/"D"
     * amount       (double)    交易量
     * balance      (double)    交易后余额
     * description  (String)    交易描述
     */
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    // 创建含参构造方法
    public Transaction(char type, double amount, double balance, String description){
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        date = new Date();
    }

    // 输出单条纪录
    public String toString(){
        return date.toString() + "    " + type + "    " + amount + "    " + balance + "    " + description;
    }
}

class Account{
    /**
     * id                   (int)                  init = 0
     * name                 (String)    客户名字
     * balance              (double)               init = 0
     * annualInterestRate   (double)    当前利率    init = 0
     * dateCreated          (Date)      开户日期
     */
    private int id = 0;
    private String name = "NULL";
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    //创建一个ArrayList transactions
    ArrayList<Transaction> transactions = new ArrayList<>();

    // 创建默认账户的无参构造方法
    public Account(){
        dateCreated = new Date();
        // 将初始化信息存入ArrayList transactions
        Transaction transaction = new Transaction('C', 0, 0, "Account Init");
        transactions.add(transaction);
    }

    // 创建带特定id, name和初始余额的账户的构造方法
    public Account(int id, String name, double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.dateCreated = new Date();
        // 将初始化信息存入ArrayList transactions
        Transaction transaction = new Transaction('C', 0, balance, "Account Init");
        transactions.add(transaction);
    }

    // 访问器
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public Date getDateCreated(){
        return dateCreated;
    }
    public double getMonth1yInterestRate(){
        return annualInterestRate/12;
    }
    public int length(){
        return transactions.size();
    }

    // id、balance和annualInterestRate的修改器
    public void setId(int id){
        System.out.print("Enter new value：");
        this.id = id;
        System.out.println("Has been alter as " + this.id);
    }
    public void setName(String name){
        System.out.print("Enter new value：");
        this.name = name;
        System.out.println("Has been alter as " + this.name);
    }
    public void setBalance(double balance){
        System.out.print("Enter new value：");
        this.balance = balance;
        System.out.println("Has been alter as " + this.balance);
    }
    public void setAnnualInterestRate(double annualInterestRate){
        System.out.print("Enter new value：");
        this.annualInterestRate = annualInterestRate;
        System.out.println("Has been alter as " + this.annualInterestRate);
    }

    // withDraw方法 从账户提取特定数额
    public void withDraw(double value){
        balance -= value;
        // 将取款信息存入ArrayList transactions
        Transaction transaction = new Transaction('W', value, balance, "WithDraw");
        transactions.add(transaction);
    }

    // deposit方法 向账户存储特定数额
    public void deposit(double value){
        balance += value;
        // 将存款信息存入ArrayList transactions
        Transaction transaction = new Transaction('D', value, balance, "Deposit");
        transactions.add(transaction);
    }

    //输出账户信息
    public String toString(){
        return "Account Info: \n*  ID\t\t\t\t\t" + id +
                "\n*  Name\t\t\t\t\t" + name +
                "\n*  AnnualInterestRate\t" + annualInterestRate +
                "\n*  CreatedDate\t\t\t" + dateCreated.toString();
    }
}