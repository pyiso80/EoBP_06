import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

public class InstanceVariablesEg extends GraphicsProgram {

   int x;

   GRect r;

   public void run() {
      inc();
      inc();
      inc();

      GLabel l = new GLabel("x's Val: " + x);
      add(l, 50, 100);

      reset();
      GLabel l1 = new GLabel("x's Val: " + x);
      add(l1, 50, 150);

      r = new GRect(100, 30);
      add(r, 50, 200);

      makeItBlue();

      pause(2000);

      makeItRed();

      pause(2000);
      GRect r2 = new GRect(100, 30);
      add(r2, 50, 250);

      pause(2000);
      makeItBlue(r2);
      pause(2000);
      makeItRed(r2);

   }

   void inc() {
      x++;
   }

   void reset() {
      x = 0;
   }

   void makeItBlue() {
      r.setFillColor(Color.BLUE);
      r.setFilled(true);
   }

   void makeItRed() {
      r.setFillColor(Color.RED);
      r.setFilled(true);
   }

   void makeItBlue(GRect r) {
      r.setFillColor(Color.BLUE);
      r.setFilled(true);
   }

   void makeItRed(GRect r) {
      r.setFillColor(Color.RED);
      r.setFilled(true);
   }


}