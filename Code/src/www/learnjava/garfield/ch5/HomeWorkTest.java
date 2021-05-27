/**
 * @author：Garfield
 * @date ：Created in 2021/5/26 17:27
 */

package www.learnjava.garfield.ch5;

public class HomeWorkTest {
    public static void main(String[] args) {
//        char[][] arr = new char[2][4];
//        System.out.println(arr[0][0] == '\u0000');
//        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};

//        String[][] a = {
//                {"Beijing","Wuhan"},
//                {"Shanghai","Guangzhou","Xian"},
//                {"Chongqing","Chengdu"}
//        };
//        System.out.println(a[a.length - 1].length);
//        System.out.println(a[a.length - 1][a[a.length - 1].length - 1].length());
//
//        String[] s = {"Monday", "Tuesday", "Wednesday", "Thirsday", "Friday", "Sataday", "Sunday"};
//        int a = s.length, b = s[1].length();
//        System.out.println(a);
//        System.out.println(b);
//        int[] array = new int[10];
//        increase(array);
//        System.out.print(array[0]);

//        int a[] = null;
//        int[] b = {};
//        int[] c = new int[]{1,2,3,4};
//        int[] d[] = new int[5][];

        int[][] arr = createArray(6);
        printArray(arr);

    }


    public static void increase(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]++;
        }
    }


    public static int[][] createArray(int row) {
        if (row <= 0) {
            return null;
        }
        int[][] arr = new int[row][];
        for (int i = 0; i < row; i++) {
            arr[i] = new int[row - i];
        }
        return arr;
    }

    public static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
    }
}
