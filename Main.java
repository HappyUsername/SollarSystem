public class Main{

    public static void main(String[] args) {

        SolarSystem ss = new SolarSystem(500, 500);
        double b=120, c=45;
        Planet Mercury = new Planet(55, 0, 45, 8, "ORANGE", ss);

       // ss.drawSolarObject(0, 0, 35, "Yellow"); // the sun
      //  ss.drawSolarObject(Mercury.getxCord(), Mercury.getyCord(), Mercury.getSize(), Mercury.getColor()); // a planet


      for(int i = 0;i<10000;i++) {
          ss.drawSolarObject(0, 0, 35, "Yellow"); // the sun
         // ss.drawSolarObjectAbout(Mercury.getxCord(), Mercury.getyCord(), Mercury.getSize(), Mercury.getColor(), b, c);
          Mercury.move();
          ss.finishedDrawing();
          //  b = b+0.1;
          //   c = c+0.9;
          //  c++;

      }

        System.out.println("som'et");

    }
}
