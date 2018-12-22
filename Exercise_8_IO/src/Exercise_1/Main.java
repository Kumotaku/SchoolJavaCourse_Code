/**
 *  编写程序，接受用户从键盘输入的一个文件名，然后判断该文件是否存在于当前目录。
 *  若存在，则继续输出：文件是否可读和可写、文件的大小、文件是一个普通文件还是一个目录。
 */
package Exercise_1;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void mian(String[] args){
        Scanner in = new Scanner(System.in);
        String s;
        s = in.next();
        File f = new File("d:\\",s);
        System.out.println("exists?"+"  "+f.exists());
        if(f.exists()){
            System.out.println("canRead?"+"  "+f.canRead());
            System.out.println("canWrite?"+"  "+f.canWrite());
            System.out.println("length:"+f.length());
            if(f.isFile()){
                System.out.println("FILE");
            }
            else {
                System.out.println("Directory");
            }
        }
        else System.out.println(s+" is not exist");
    }
}
