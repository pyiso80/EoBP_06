import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Eg01A_Rects extends GraphicsProgram {
   public void run() {

      GRect r1 = new GRect(50, 50, 200, 250);
      r1.setFilled(true);
      r1.setFillColor(Color.RED);
      add(r1);

      GRect r2 = new GRect(275, 50, 200, 250);
      r2.setFilled(true);
      r2.setFillColor(Color.DARK_GRAY);
      add(r2);

      pause(5000);

      r1.setFillColor(Color.DARK_GRAY);
      r2.setFillColor(Color.RED);

      pause(2000);

      GOval c1 = new GOval(550, 50, 150, 150);
      add(c1);
   }
}