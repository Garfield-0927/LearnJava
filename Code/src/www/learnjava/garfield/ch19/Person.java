/**
 * @author：Garfield
 * @date ：Created in 2021/5/18 22:08
 */

package www.learnjava.garfield.ch19;

public class Person {
    public static void main(String[] args) {
//        Class clz = Manager.class;
        Object o = new Manager();
        Class clz = o.getClass();
        System.out.println(clz.getName());              // 获取完全限定名 www.learnjava.garfield.ch19.Manager
        System.out.println(clz.getSimpleName());        // 获取简单名    Manager

        Class superclz = clz.getSuperclass();           // 获取直接父类
        System.out.println(superclz.getName());         // 获取完全限定名 www.learnjava.garfield.ch19.Employee
        System.out.println(superclz.getSimpleName());   // 获取简单名    Employee

    }
}

class Employee extends Person {

}

class Manager extends Employee {

}
