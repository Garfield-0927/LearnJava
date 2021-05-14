/**
 * @author：Garfield
 * @date ：Created in 2021/5/14 23:54
 */

package www.learnjava.garfield.ch9;

public class A {
    public void m(int x, int y){
        // do something
    }
    // m方法的重载
    public void m(double x, double y){
        // do something
    }
}

class B extends A{
    // m方法的重载
    public void m(float x, float y){
        // do something
    }
    // m方法的覆盖
    public void m(int x, int y){
        // do something else
    }
    // 下面这个方法既不是重载也不是覆盖
//    public int m(int x, int y){

//    }
}
