/**
 * @author：Garfield
 * @date ：Created in 2021/5/15 0:10
 */

package www.learnjava.garfield.ch9;

public class Foo {
    protected int i = 5;
    protected static double k = 1.0;

    void setI(int i){
        this.i = i;
    }
    static void setK(double k){
        Foo.k = k;
    }

    public static void main(String[] args) {
        Foo foo1 = new Foo();
        Foo foo2 = new Foo();

        foo1.setI(19);      // this指向f1
        foo2.setI(2);       // this指向f2
    }
}
