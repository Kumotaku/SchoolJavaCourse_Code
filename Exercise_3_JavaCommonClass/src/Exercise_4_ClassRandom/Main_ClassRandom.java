/*创建种子是1000的Random对象，然后使用nextInt(100)方法显示0到100之间前50个随机整数。*/

package Exercise_4_ClassRandom;

import java.util.Random;

public class Main_ClassRandom {
    public static void main(String[] args){
        Random random = new Random(1000);
        for (int i = 0; i < 50; i ++)
            System.out.print(random.nextInt(100) + " ");
    }
}
