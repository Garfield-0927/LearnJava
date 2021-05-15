/**
 * @author：Garfield
 * @date ：Created in 2021/5/15 20:12
 */

package www.learnjava.garfield.ch11;

public class OverrideDemo {
    public static void main(String[] args) {
        A o = new B();
        o.m();
        o.s();
    }
}

class A{
    public void m(){
        System.out.println("A's m");
    }

    public static void s(){
        System.out.println("A's s");
    }
}
class B extends A{
    public void m(){
        System.out.println("B's m");
    }

    public static void s(){
        System.out.println("B's s");
    }
}
