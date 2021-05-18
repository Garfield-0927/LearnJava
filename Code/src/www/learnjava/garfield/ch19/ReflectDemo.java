/**
 * @author：Garfield
 * @date ：Created in 2021/5/18 22:30
 */

package www.learnjava.garfield.ch19;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectDemo {
    public static void main(String[] args) {
        Class clz = Student.class;
        Constructor[] constructors = clz.getConstructors();     // 获得构造函数
        Method[] methods = clz.getMethods();

        try {
            //实例化对象
            //1：如有缺省构造函数，调用Class对象的newInstance方法
            Student s1 = (Student)clz.newInstance();
            //2. 调用带参数的构造函数
            Student s2 = (Student)clz.getConstructor(String.class).newInstance("John");
            //invoke method
            Method m = clz.getMethod("setName", String.class);
            m.invoke(s1, "Marry"); //调用s1对象的setName方法，实参"Marry"
            System.out.println(s1.toString());
            System.out.println(s2.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

class Student{
    private String name;

    public Student(){

    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
