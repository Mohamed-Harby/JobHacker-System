package week6.src.task1;

import java.util.Date;

public class GeometricObject {
    String colorName;
    boolean filled;
    Date creationDate;

    public GeometricObject() {
        creationDate = new Date();
    }
    public GeometricObject (String colorName, boolean filled, Date creationDate) {
        this.colorName = colorName;
        this.filled = filled;
        this.creationDate = creationDate;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "colorName='" + colorName + '\'' +
                ", filled=" + filled +
                ", creationDate=" + creationDate +
                '}';
    }
}
