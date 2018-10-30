/**
 * This class represents a planet.
 */
public class Planet extends Point {

    public Planet(double xCord, double yCord, double velocity, double size, String color, SolarSystem s) {
        super(xCord, yCord, velocity, size, color, s);
    }

    @Override
    void move() {

     //   s.drawSolarObjectAbout(getxCord(), getyCord(), getSize(), getColor(), 120, getVelocity());
        s.drawSolarObjectAbout(getxCord(), getyCord(), getSize(), getColor(), 0, getVelocity());
        setyCord(getyCord() + getVelocity());

    }
}
