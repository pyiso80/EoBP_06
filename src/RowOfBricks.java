import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class RowOfBricks extends GraphicsProgram {
   public void run() {

      double x = getWidth()/2.0 - (WIDTH * 4) / 2.0;
      double y = getHeight()/2.0 - (HEIGHT / 2.0);
      for (int i = 0; i < 4; i++) {
         GRect r = new GRect(x + i * WIDTH, y, WIDTH, HEIGHT);
         add(r);

      }

   }

   static final double WIDTH = 100;
   static final double HEIGHT = 50;
}