/**
 * @author：Garfield
 * @date ：Created in 2021/5/27 17:15
 */

package www.learnjava.garfield.ch11;

//public class HomeWorkTest extends Base {
//    public HomeWorkTest (String s) {
//        super(s);
//        System.out.print("D");
//    }
//    public static void main(String[] args) {
//
//    }
//}
//
//class Base {
//    public Base(String s) {
//        System.out.print("B");
//    }
//}
//
//
//interface I { }
//class A implements I { }
//class B extends A { }
//class C extends B {
//    public static void main(String[] args) {
//        B b = new B();
//        C c = (C) b;
//    }
//}


//public class HomeWorkTest {
//    public static void main(String[] args) {
//        new B().display();
//
//    }
//}
//
//class A {
//    public void draw() {
//        System.out.print("Draw A.");
//    }
//
//    public void display() {
//        draw();
//        System.out.print("Display A.");
//    }
//
//}
//
//class B extends A {
//    public void draw() {
//        System.out.print("Draw B.");
//    }
//
//    public void display() {
//        super.display();
//        System.out.print("Display B.");
//    }
//}

//public class HomeWorkTest {
//    public static void main(String args[]) {
//        try {
//            System.out.print("try.");
//            return;
//        } catch (Exception e) {
//            System.out.print("catch.");
//        } finally {
//            System.out.print("finally.");
//        }
//    }
//}


import java.io.IOException;

//public class HomeWorkTest {
//    //    public void m1() throws IOException {
////        try {
////            throw new IOException();
////        } catch (IOException e) {
////
////        }
////
////    }
////    public void m2() {
////        m1();
////    }
//    public void m1() throws RuntimeException {
//        throw new RuntimeException();
//    }
//
//    public void m2() {
//        m1();
//    }
//}
//
//class Car {
//
//    public void run() {
//        System.out.println("run method");
//    }
//}
//
//abstract class Car2 extends Car {
//
//}
//
//class SuperClass {
//    static int i = 10;
//    static {
//        System.out.println(" static in SuperClass");
//    }
//    {
//        System.out.println("SupuerClass is called");
//    }
//}
//class SubClass extends SuperClass {
//    static int i = 15;
//    static {
//        System.out.println(" static in SubClass");
//    }
//    SubClass() {
//        System.out.println("SubClass is called");
//    }
//    public static void main(String[] args) {
//        int i = SubClass.i;
//        new SubClass();
//        new SuperClass();
//    }
//}
//
//
//class Test5 {
//    public static void main(String... args){
//        C o1 = new D();
//        o1.m(1,1);   			//①
//        o1.m(1.0,1.0);			//②
//        o1.m(1.0f, 1.0f);		//③
//
//        D o2 = new D();
//        o2.m(1,1);			//④
//        o2.m(1.0,1.0);		//⑤
//        o2.m(1.0f, 1.0f);		//⑥
//    }
//}
//
//class C{
//    public void m(int x, int y) {
//        System.out.println("C's m(int,int)");
//    }
//    public void m(double x, double y) {
//        System.out.println("C' m(double,double)");
//    }
//}
//
//class D extends C{
//    public void m(float x, float y) {
//        System.out.println("D's m(float,float)");
//    }
//    public void m(int x, int y)  {
//        System.out.println("D's m(int,int)");
//    }
//}

class Test_Hide_Override {
    public static void main(String... args) {
        A o = new C();
        o.m1();                     //①
        o.m2();                     //②
        ((B) o).m1();              //③
        ((A) (B) o).m1();              //④
        ((A) (B) o).m2();              //⑤
    }
}


class A {
    public static void m1() {
        System.out.println("A's m1");
    }
    public void m2() {
        System.out.println("A's m2");
    }
}

class B extends A {
    public static void m1() {
        System.out.println("B's m1");
    }
    public void m2() {
        System.out.println("B's m2");
    }
}


class C extends B {
    public static void m1() {
        System.out.println("C's m1");
    }
    public void m2() {
        System.out.println("C's m2");
    }
}