/**
 * @author：Garfield
 * @date ：Created in 2021/5/14 22:13
 */

package www.learnjava.garfield.ch7;

import java.util.Arrays;

/**
 * 实现二分查找
 */
public class BinarySeach {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,11,42,64,88,89,90,122,233,444,666,888};
        int[] a = new int[]{3,4,2,8,5,6,956,345,5645};
        Arrays.sort(a);
        int index = Arrays.binarySearch(a, 956);
        System.out.println(Arrays.toString(a));
        System.out.println(index);
        System.out.println(binarySearch(arr,42));
        System.out.println(binarySearch(arr,233));
        System.out.println(binarySearch(arr,111));
    }

    public static int binarySearch(int[] arr, int target) {
        int len = arr.length;
        int low = 0;
        int high = len - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
