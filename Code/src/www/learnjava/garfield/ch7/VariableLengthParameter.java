/**
 * @author：Garfield
 * @date ：Created in 2021/5/14 22:07
 */

package www.learnjava.garfield.ch7;

/**
 * 可变长形参举例
 */
public class VariableLengthParameter {
    public static void main(String[] args) {
        System.out.println(VariableLengthParameter.sum(1,2,3,4,5,6,67,78));
    }
    public static int sum(int n1, int n2, int... n3) {
        int s = 0;
        s += n1;
        s += n2;
        for (int i : n3) {
            s += i;
        }
        return s;
    }
}
