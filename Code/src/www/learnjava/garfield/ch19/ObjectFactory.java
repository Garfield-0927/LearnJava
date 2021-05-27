/**
 * @author：Garfield
 * @date ：Created in 2021/5/18 23:29
 */

package www.learnjava.garfield.ch19;

import java.util.ArrayList;
import java.util.List;

public class ObjectFactory<T> {
    private Class<T> type;      // 保存要创建的对象的类型信息

    public ObjectFactory(Class<T> type) {
        this.type = type;
    }

    public T create() {
        T o = null;
        try {
            o = type.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return o;
    }
}

class GeometricObject {
}

class PolyGon extends GeometricObject {
}

class Rectangle extends PolyGon {

    public static void main(String[] args) {
//        Class<PolyGon> clz3 = null;
//        clz3 = PolyGon.class;
//        Class<? extends PolyGon> clz4 = null;
//        clz4 = GeometricObject.class;
//        clz4 = PolyGon.class;
//        clz4 = Rectangle.class;
        ArrayList<String> lists = new ArrayList<String>();
        ArrayList<? extends Object> lists2 = new ArrayList<String>();
        ArrayList<? super String> lists3 = new ArrayList<Object>();
        ArrayList<String> lists4 = new ArrayList();
        ArrayList lists5 = new ArrayList<String>();
    }
}


class Holder<T> {
    T value;

    public Holder(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

class RawHolder {
    Object value;

    public RawHolder(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }


//    public static void main(String[] args) {

//        Holder<String> h1 = new Holder<>("aaa");
//        String s1 = h1. getValue ();
//        System.out.println(s1);


//        RawHolder h1 = new RawHolder("aaa");
//        String s1 = (String)h1. getValue ();
//        System.out.println(s1);
//
//
//        Holder<String> h1 = new Holder<> (Integer.valueOf(111));
//        String s1 = h1. getValue ();
//        System.out.println(s1);

//
//        RawHolder h1 = new RawHolder (Integer.valueOf(111));
//        String s1 = (String)h1. getValue ();
//        System.out.println(s1);
//
//        List<String> list = new ArrayList<String>();
//        list.add("test");
//        list.add("red");
//        list.add (100);
//        System.out.println(list. size ());
//
//        List<Integer> ex_int= new ArrayList<Integer> ();
//        List<Number> ex_num = ex_int;
//        System.out.println(ex_num. size ());
//        List<?> c1 = new ArrayList<String>();
//        c1.add(new Object());
//        List<?> c2 = new ArrayList<String>();
//        c2.add(new String("1"));
//        List<?> c3 = new ArrayList<String>();
//        c3.add("1");
//        List<?> c4 = new ArrayList<String>();
//        c4.add(null);}
}



class Shape {
}

class Circle extends Shape {
}

class Triangle extends Shape {
}

class Test2_9 {
    public static void main(String[] args) {
        List<? extends Shape> list1 = new ArrayList<Triangle>();
        List<? extends Shape> list2 = new ArrayList<Circle>();
//        System.out.println(list1 instanceof List<Triangle>);
        System.out.println(list2 instanceof List);
        System.out.println(list1.getClass() == list2.getClass());
    }
}
