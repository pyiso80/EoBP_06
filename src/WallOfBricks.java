import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class WallOfBricks extends GraphicsProgram {
   public void run() {

      double x = getWidth()/2.0 - (WIDTH * NO_COL) / 2.0;
      double y = getHeight()/2.0 - ((HEIGHT * NO_ROW) / 2.0);
      for(int j = 0; j < NO_ROW; j++) {
         for (int i = 0; i < NO_COL; i++) {
            GRect r = new GRect(x + i * WIDTH, y + j * HEIGHT, WIDTH, HEIGHT);
            add(r);
         }
      }

   }

   static final double WIDTH = 100;
   static final double HEIGHT = 40;
   static final int NO_ROW = 7;
   static final int NO_COL = 5;

}