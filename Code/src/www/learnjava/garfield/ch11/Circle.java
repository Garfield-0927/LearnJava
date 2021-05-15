/**
 * @author：Garfield
 * @date ：Created in 2021/5/15 19:21
 */

package www.learnjava.garfield.ch11;

import java.util.Date;

public class Circle extends GeometricObj{
    private double radius;

    public Circle(String color, Date createDate, boolean isFilled) {
        super(color, createDate, isFilled);
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
