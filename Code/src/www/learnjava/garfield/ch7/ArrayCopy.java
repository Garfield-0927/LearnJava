/**
 * @author：Garfield
 * @date ：Created in 2021/5/14 21:52
 */

package www.learnjava.garfield.ch7;

/**
 * 实现数组的深拷贝
 */
public class ArrayCopy {
    public static void main(String[] args) {
        String[] arr = new String[10];
        String BASE = "String";
        for (int i = 0; i < 10; i++) {
            arr[i] = BASE + String.valueOf(i);
        }

        String[] cpy = new String[10];
        System.arraycopy(arr, 0, cpy, 0, arr.length);
        String[] cpy2 = arr.clone();
        System.out.println(arr == cpy);     // false
        System.out.println(arr == cpy2);    // false
        for (int i = 0; i < 10; i++) {
            System.out.println(cpy[i]);
            System.out.println(cpy2[i]);
        }
    }

}
