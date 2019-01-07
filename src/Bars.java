import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Bars extends GraphicsProgram {
   public void run() {

      for (int i = 0; i < 10; i++) {
         GRect r = new GRect(20, 20 + i * 20, 120 - (i * 10), 20) ;
         add(r);
      }

   }
}