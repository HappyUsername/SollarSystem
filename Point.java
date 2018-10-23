import com.sun.prism.shader.Solid_LinearGradient_PAD_AlphaTest_Loader;

/**
 * This class represents a point. It is extended by all other classes.
 *
 */
public abstract class Point {

    private double xCord, yCord;
    private double velocity;
    private double size;
    private String color;
    SolarSystem s;

    public Point(double xCord, double yCord, double velocity, double size, String color, SolarSystem s) {
        this.xCord = xCord;
        this.yCord = yCord;
        this.velocity = velocity;
        this.size = size;
        this.color = color;
        this.s = s;
    }
/*   public Point(double xCord, double yCord, double velocity, double size, String color) {
        this.xCord = xCord;
        this.yCord = yCord;
        this.velocity = velocity;
        this.size = size;
        this.color = color;

    }*/


    /**
     * This method is used to move the object according to velocity.
     *
     */
    abstract void move();

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
