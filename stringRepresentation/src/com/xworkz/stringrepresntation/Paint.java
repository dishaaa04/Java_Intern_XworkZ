package com.xworkz.stringrepresntation;

public class Paint {
    private String color;
    private String finish;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Paint) {
            Paint other = (Paint) obj;
            return this.color.equals(other.color) && this.finish.equals(other.finish);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Paint{color='" + color + "', finish='" + finish + "'}";
    }

    @Override
    public int hashCode() {
        return color.hashCode() + finish.hashCode();
    }
}
