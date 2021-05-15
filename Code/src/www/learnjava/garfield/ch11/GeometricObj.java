/**
 * @author：Garfield
 * @date ：Created in 2021/5/15 19:20
 */

package www.learnjava.garfield.ch11;

import java.util.Date;

public class GeometricObj {
    private String color;
    private Date createDate;
    private boolean isFilled;

    public GeometricObj(String color, Date createDate, boolean isFilled) {
        this.color = color;
        this.createDate = createDate;
        this.isFilled = isFilled;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    @Override
    public String toString() {
        return "GeometricObj{" +
                "color='" + color + '\'' +
                ", createDate=" + createDate +
                ", isFilled=" + isFilled +
                '}';
    }
}
