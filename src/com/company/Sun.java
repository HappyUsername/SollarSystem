package com.company;

/**
 * This class represents a Sun.
 */
public class Sun extends Point {

    private String col;
    private double size;

    public Sun(double xCord, double yCord) {
        super(xCord, yCord);
        col = "Yellow";
        size = 15;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
