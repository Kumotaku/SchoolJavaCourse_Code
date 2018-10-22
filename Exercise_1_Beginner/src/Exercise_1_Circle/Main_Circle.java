/**
 * 定义一个表示圆的名为Circle的类，其软件接口是：
 *  class Circle {
 *      public void setRadius(int r);
 *      public int getArea( );
 *      public int getPerimeter( );
 *      public int getRadius( );
 *  }
 * 然后定义一个应用程序起始类TestCircle测试该类。
 */

package Exercise_1_Circle;

import java.util.Scanner;

public class Main_Circle {

    public static void main(String[] args) {
        while(true){
            Circle NewCircle = new Circle();
            Scanner InputRadius = new Scanner(System.in);
            double Radius = InputRadius.nextDouble();

            NewCircle.setRadius(Radius);

            System.out.println("Area = " + NewCircle.getArea());
            System.out.println("Perimeter = " + NewCircle.getPerimeter());
            System.out.println("Radius = " + NewCircle.getRadius());

        }
    }
}

class Circle{
    private double Radius;
    public void setRadius(double r) {
        Radius = r;
    }
    public double getArea( ) {
        return Radius * Radius *3.1415926535897;
    }
    public double getPerimeter( ) {
        return Radius *2*3.1415926535897;
    }
    public double getRadius( ) {
        return Radius;
    }
}