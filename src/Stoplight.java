import acm.graphics.GCompound;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;


public class Stoplight extends GraphicsProgram {
   public void run() {
      drawStoplights(30, 30, 50);
   }

   void drawStoplights(double x, double y, double r) {
      double lightSz = 2 * r;
      GCompound stoplight = new GCompound();

      GRect box = new GRect(0, 0, lightSz, 3 * lightSz);
      box.setFilled(true);
      box.setFillColor(Color.DARK_GRAY);
      GOval red = new GOval(0, 0, lightSz, lightSz);
      red.setFilled(true);
      red.setFillColor(Color.RED);
      GOval yellow = new GOval(0, lightSz, lightSz, lightSz);
      yellow.setFilled(true);
      yellow.setFillColor(Color.YELLOW);
      GOval green = new GOval(0, 2 * lightSz, lightSz, lightSz);
      green.setFilled(true);
      green.setFillColor(Color.GREEN);
      stoplight.add(box);
      stoplight.add(red);
      stoplight.add(yellow);
      stoplight.add(green);
      add(stoplight, x, y);
   }
}