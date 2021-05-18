/**
 * @author：Garfield
 * @date ：Created in 2021/5/18 22:45
 */

package www.learnjava.garfield.ch19;

public class GenericMethodDemo {

    public static void main(String[] args) {
        Integer[] integers = {1,2,3,4,5};
        GenericMethodDemo.<Integer>print(integers);
    }

    public static <T> void print(T[] arr) {
        for (T t : arr) {
            System.out.println(t.toString());
        }
    }
}
