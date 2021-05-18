/**
 * @author：Garfield
 * @date ：Created in 2021/5/18 23:30
 */

package www.learnjava.garfield.ch19;

public class TestFactory {
    public static void main(String[] args) {
        //首先创建一个负责生产Car的对象工厂，传进去需要创建对象的类的Class信息
        ObjectFactory<Car> carFactory = new ObjectFactory<Car>(Car.class);
        Car o = carFactory.create();  //由对象工厂负责产生car对象
        System.out.println(carFactory.create().toString());

    }
}

class Car {
    private String s = null;
    public Car() {
        s = "Car";
    }
    public String toString() {
        return s;
    }
}
