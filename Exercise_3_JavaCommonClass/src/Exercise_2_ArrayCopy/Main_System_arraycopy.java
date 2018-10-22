/*使用System类中的方法，编程实现数组的复制。*/

package Exercise_2_ArrayCopy;

public class Main_System_arraycopy {
    public static void main(String[] args){
        int[] list1 = {1, 2, 3, 4, 5};
        int[] list2 = new int[5];
        System.arraycopy(list1,0,list2,0,5);
        System.out.print("Copy from:   1 2 3 4 5\nCopy result: ");
        for(int i = 0; i < 5; i ++){
            System.out.print(list2[i] + " ");
        }
    }
}
