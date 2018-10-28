/**设计一个名为Triangle的类来扩展GeometricObject类。该类包括：
 *      三个名为side1、side2和side3的double数据域表示这个三角形的三条边，它们的默认值是1.0。
 *      一个无参构造方法创建默认的三角形。
 *      一个能创建带指定side1、side2和side3的三角形的构造方法。
 *      所有三个数据域的访问器方法。
 *      一个名为getArea( )的方法返到这个三角形的面积。
 *      一个名为getPerimeter( )的方法返回这个三角形的周长。
 *      一个名为toString( )的方法返回这个三角形的字符串描述。其方法的实现如下所示：
 *          return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
 * 实现这些类。编写一个测试程序，创建边长为1、1.5和1，颜色为ye1low, filled为true的Triangle对象，然后显示它的面积，周长、颜色以及是否被填充。
 */

package Exercise_2_Triangle;

import java.util.Date;

public class Main_Triangle {
    public static void main(String[] args){
        //按照题意有参实例化Triangle
        Triangle triangle = new Triangle(1, 1.5, 1, "Yellow", true);
        //输出依题意创建的triangle对象的信息
        System.out.println(triangle.toString() +
                "\nArea: " + triangle.getArea() + ", getPerimeter: " + triangle.getPerimeter() +
                "\n" + triangle.toStringGeo());
    }
}

//抽象父类GeometricObject
abstract class GeometricObject{
    private String color;
    private boolean filled;
    private Date dateCreated;

    //GeometricObject的无参构造方法，调用了Date类
    public GeometricObject(){
        dateCreated = new Date();
    }

    //GeometricObject的有参构造方法
    //构造参数中不用传入Date
    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }

    //对外输出颜色
    public String getColor(){
        return color;
    }

    //对内获取颜色
    public void setColor(String color){
        this.color = color;
    }

    //对外输出填充情况
    public boolean isFilled(){
        return filled;
    }

    //对内获取填充情况
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    //对外输出构造日期
    public Date getDateCreated(){
        return dateCreated;
    }

    //用于输出GeometricObject的字符串信息
    public String toStringGeo(){
        return "Color: " + color + ", Filled: " + filled + "\nCreated on " + dateCreated;
    }
}

//由抽象父类GeometricObject派生的子类Triangle
class Triangle extends GeometricObject{
    private double side1 = 1, side2 = 1, side3 = 1;

    //Triangle的无参构造方法
    public Triangle(){}

    //Triangle的有参构造方法
    public Triangle(double side1, double side2, double side3, String color, boolean filled){
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //对外输出三边各自长度
    public double getSide(String side){
        if (side == "side1")
            return side1;
        else if (side == "side2")
            return side2;
        else
            return side3;
    }

    //计算并对外输出面积
    public double getArea(){
        /**（海伦公式）
         * p=(a+b+c)/2
         * S=sqrt[p(p-a)(p-b)(p-c)]
         */
        double temp = this.getPerimeter()/2;
        return Math.sqrt(temp*(temp-side1)*(temp-side2)*(temp-side3));
    }

    //计算并对外输出周长
    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    //用于输出Triangle的字符串信息
    public String toString(){
        return "Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3;
    }
}
