/**
 * 为二次方程式ax²+bx+c=0设计一个名为QuadraticEquation的类。这个类包括：
 * * 代表三个系数的私有数据域a、b、c；
 * * 一个参数为a、b、c的构造方法；
 * * a、b、c的三个get方法；
 * * 一个名为gitDiscriminant的方法回判别式，b²-4ac；
 * * 一个名为getRoot1( )和getRoot( )2的方法返回等式的两个根。
 * 这些方法只有在判别式为非负数时才有用。如果判别式为负，这些方法返回0。
 * 画出该类的UML。实现这个类。编写一个测试程序，提示用户输入a、b、c的值，然后显示判别式的结果。
 * 如果判别式为正数，显示两个根；如果判别式为0，显示一个根；否则显示：“The equation has no roots.”
 */

package Exercise_5_QuadraticEquation;

import java.util.Scanner;

public class Main_QuadraticEquation {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        while(true){
            //Create a new object and init it.
            System.out.print("Input values of a, b, c in turn: ");
            QuadraticEquation equation = new QuadraticEquation(Input.nextDouble(), Input.nextDouble(), Input.nextDouble());

            //Output the value of a, b and c.
            System.out.println("Your Enter: a = " + equation.get_member('a') +
                    ", b = " + equation.get_member('b') +
                    ", c = " + equation.get_member('c'));

            //Calculate and Output the value of discriminant.
            double Discriminant = equation.gitDiscriminant();
            System.out.println("Discriminant result b²-4ac = " + Discriminant);

            //Calculate and output the root(s) according to the value of the discriminant.
            if(Discriminant > 0)
                System.out.println("Root 1 = " + equation.getRoot1() + " , Root 2 = " + equation.getRoot2());
            else if(Discriminant == 0)
                System.out.println("Root 1 = Root 2 = " + equation.getRoot1());
            else
                System.out.println("The equation has no roots.");
            System.out.println();
        }
    }
}

class QuadraticEquation {
    private double a, b, c;

    QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double get_member(char m){
        if (m == 'a') return a;
        else if (m == 'b') return b;
        else if (m == 'c') return c;
        else return -1;
    }

    public double gitDiscriminant(){
        return b*b - 4*a*c;
    }

    public double getRoot1(){
        return (-b + Math.sqrt(gitDiscriminant()))*0.5;
    }

    public double getRoot2(){
        return (-b - Math.sqrt(gitDiscriminant()))*0.5;
    }
}
