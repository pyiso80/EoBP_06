import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Circles extends GraphicsProgram {
   public void run() {

      double x = 40;
      double y = 20;

      for (int i = 0; i < 10; i++) {

         GOval c = new GOval((x + i * 40), (y + i * 40), 100, 100);
         add(c);

      }

   }
}