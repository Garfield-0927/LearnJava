/**
 * @author：Garfield
 * @date ：Created in 2021/5/13 23:22
 */

package www.learnjava.garfield.ch4;

public class FormatOutPut {
    // 格式化输出
    public static void main(String[] args) {
        System.out.printf("boolean:%6b\n", false);
        System.out.printf("boolean:%6b\n", true);
        System.out.printf("character:%4c\n", 'a');
        System.out.printf("integer:%6d,%6d\n", 100,200);
        System.out.printf("double:%7.2f\n", 12.23);
        System.out.printf("String:%7s\n", "JAVA");
    }
}
