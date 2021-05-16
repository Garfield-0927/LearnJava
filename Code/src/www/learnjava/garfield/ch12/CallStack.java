/**
 * @author：Garfield
 * @date ：Created in 2021/5/16 17:02
 */

package www.learnjava.garfield.ch12;

public class CallStack {
    public static void methodA(){
        System.out.println("in A");
        try {
            methodB();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("end A");
    }

    public static void methodB(){
        System.out.println("in B");
        methodC();
        System.out.println("end B");
    }

    public static void methodC(){
        System.out.println("in C");
        int i = 10/0;
        System.out.println(i);
        System.out.println("end C");
    }

    public static void main(String[] args) {
        System.out.println("in Main");
        methodA();
        System.out.println("end Main");
    }
}
