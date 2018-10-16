package com.company;

/**
 * This class represents a moon.
 */
public class Moon extends Point {

    private double velocity;
    private double size;
    private String color;

    /**
     * Constructor for class.
     * @param xCord
     * @param yCord
     * @param velocity
     * @param size
     * @param color
     */
    public Moon(double xCord, double yCord, double velocity, double size, String color) {
        super(xCord, yCord);
        this.velocity = velocity;
        this.size = size;
        this.color = color;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
