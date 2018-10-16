package com.company;

/**
 * This class represents a point. It is extended by all other classes.
 *
 */
public class Point {
    private double xCord, yCord;

    /**
     *
     * @return
     */
    public double getxCord() {
        return xCord;
    }

    public double getyCord() {
        return yCord;
    }

    public void setxCord(double xCord) {
        this.xCord = xCord;
    }

    public void setyCord(double yCord) {
        this.yCord = yCord;
    }

    /**
     * Constructor for class Point.
     * @param xCord
     * @param yCord
     */
    public Point(double xCord, double yCord) {
        this.xCord = xCord;
        this.yCord = yCord;
    }
}
