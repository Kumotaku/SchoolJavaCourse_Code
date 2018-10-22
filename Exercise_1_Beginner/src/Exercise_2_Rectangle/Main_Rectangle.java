/**
 * 定义一个表示矩形的名为Rectangle的类，其软件接口是：
 *  class Rectangle{
 *      public void setwidth(int W);
 *      public void setHeight(int h);
 *      public int getArea( );
 *      public int getPerimeter( );
 *      public int getwidth( );
 *      public int getHeight( );
 *  }
 * 然后定义一个应用程序起始类TestRectangle测试该类。
 */
package Exercise_2_Rectangle;

import java.util.Scanner;

public class Main_Rectangle {
    public static void main(String[] args) {
        while (true){
            Rectangle NewRect = new Rectangle();

            Scanner Input = new Scanner(System.in);
            NewRect.setHeight(Input.nextDouble());
            NewRect.setWidth(Input.nextDouble());

            System.out.println("Area = " + NewRect.getArea());
            System.out.println("Perimeter = " + NewRect.getPerimeter());
            System.out.println("Width = " + NewRect.getWidth());
            System.out.println("Height = " + NewRect.getHeight());

            Input.close();
        }
    }
}

class Rectangle{
    private double Width;
    private double Height;

    public void setWidth(double W) {
        Width = W;
    }
    public void setHeight(double h) {
        Height = h;
    }
    public double getArea( ) {
        return Height * Width;
    }
    public double getPerimeter( ) {
        return (Height + Width) * 2;
    }
    public double getWidth( ) {
        return Width;
    }
    public double getHeight( ) {
        return Height;
    }
}