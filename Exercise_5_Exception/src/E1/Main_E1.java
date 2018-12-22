/** 有数组a[ ]={10,20,30,40}，数组b={1,2,3,0}，设计一个程序，求数组c[ ]=a[i]/b[i]，i从0~4中选择。捕获可能出现的异常。 */

package E1;

public class Main_E1 {
    public static void main(String[] args){
        int[] a = {10,20,30,40};
        int[] b = {1,2,3,0};
        int[] c=new int[a.length];
        for(int i = 0; i<a.length; i ++) {
            try {
                c[i] = a[i] / b[i];
            }
            //分母为零抛出的异常
            catch(ArithmeticException e) {
                e.printStackTrace();
            }
            // 数组越界的异常 如果数组 a,b确定长度相等，不用捕捉此异常
            catch(ArrayIndexOutOfBoundsException e) {
                break;
            }
        }
    }
}

