public class Main{

    public static void main(String[] args) {

        SolarSystem ss = new SolarSystem(900, 600);

       // Planet Mercury = new Planet(55, 0, 1, 6, "ORANGE", ss);
     //   Planet Venuce = new Planet(80, 180, 2, 11, "BROWN", ss);
        Planet planets[] = new Planet[9];

        ss.drawSolarObject(0, 0, 35, "Yellow"); // the sun11

        planets[0] = new Planet(55, 0, 0.6, 4, "BROWN", ss); // Mercury
        planets[1] = new Planet(80, 180, 0.9, 6, "GRAY", ss); // venuce
        planets[2] = new Planet(100, 110, 0.9, 8, "BLUE", ss); // Earth
        planets[3] = new Planet(120, 140, 0.9, 7, "ORANGE", ss); // Mars
        planets[4] = new Planet(140, 34, 0.9, 14, "MAGENTA", ss);// Jupiter
        planets[5] = new Planet(160, 20, 0.9, 11, "BROWN", ss);// Saturn
        planets[6] = new Planet(190, 60, 0.9, 10, "WHITE", ss);// Uranus
        planets[7] = new Planet(220, 160, 0.9, 12, "BLUE", ss);// neptune
        planets[8] = new Planet(250, 90, 0.9, 2, "BROWN", ss);//Pluto

      for(int i = 0;i<10000;i++) {

          ss.drawSolarObject(0, 0, 35, "Yellow"); // the sun

          for (int j = 0; j<8 ; j++){
              planets[j].move();

          }

          ss.finishedDrawing();

      }



    }
}
