/**
 * @author：Garfield
 * @date ：Created in 2021/5/14 21:25
 */

package www.learnjava.garfield.ch6;

/**
 * 展示java中由于方法重载而产生的歧义调用
 */
public class AmbiguousInvocation {
    public static void main(String[] args) {
//        System.out.println(AmbiguousInvocation.max(1,2));
        // 编译器报错：对max的引用不明确，无法确定用哪个函数，因为参数都能相容
    }

    public static double max(int num1, double num2){
        return (num1 > num2)?num1:num2;
    }

    public static double max(double num1, int num2){
        return (num1 > num2)?num1:num2;
    }
}
