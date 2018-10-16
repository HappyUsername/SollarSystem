package com.company;

/**
 * This class represents a planet.
 */
public class Planet extends Point {

   // Point p = new Point();
    private double size;
    private double velocity;
    private String color;

    public Planet(double xCord, double yCord, double size, double velocity, String color) {
        super(xCord, yCord);
        this.size = size;
        this.velocity = velocity;
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    /**
     * This method is used to move the object according to velocity.
     *
     */
    public void move(){


    }
}
