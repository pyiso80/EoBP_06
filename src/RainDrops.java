import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

import java.awt.*;
import java.awt.event.KeyEvent;

/*
Animate rain drops falling. 3 new raindrops appears every half sec at random x
position and each raindrop falls 20px/sec.

To look a little better, raindrops appearing
at the same time should not overlap.

To make it beautiful, make rain drop random color.

Some creative ideas you can try:
   1. make the fall directed left or right to emulate windy situation
   2. to emulate rain less or rain more heavily,
 */

public class RainDrops extends GraphicsProgram {

   //indicate whether the program has paused or not
   boolean hasPaused = false;

   public void run() {
      createRainDrops(3);
      int elapsed = 0;
      while (true) {
         if(!hasPaused) {
            for (int i = 0; i < getElementCount(); i++) {
               //move every raindrops in the canvas by 2px downwards
               GOval o = getElement(i);
               o.move(0, 2);
               //remove raindrops that have passed the height of canvas and become
               //invisible
               if (o.getY() > getHeight()) {
                  remove(o);
               }
            }
            pause(50);
            //System.out.println("Total raindrops: " + getElementCount());
            elapsed += 50;

            if (elapsed % 500 == 0) {
               createRainDrops(3);
               //System.out.println("Total raindrops: " + getElementCount());
            }
         }else {
            pause(100);
         }
      }

   }

   /*
   This method create "n" non overlapping rain drops at random x location and
   y = 0.
    */

   void createRainDrops(int n) {
      //number of rain drops created
      int cnt = 0;
      while (cnt < n) {
         //note that getWidth() - SZ is to make sure portion of created rain
         //drop doesn't go beyond the right edge of the canvas i.e every rain
         //drop must be fully visible within the canvas
         double x = RandomGenerator.getInstance().nextDouble(0, getWidth() - SZ);
         GOval drop = new GOval(SZ, SZ);
         if (!hasOverlappingRaindrop(drop)) {

            drop.setFilled(true);
            drop.setFillColor(new Color(
            RandomGenerator.getInstance().nextInt(0, 255),
            RandomGenerator.getInstance().nextInt(0, 255),
            RandomGenerator.getInstance().nextInt(0, 255)
            ));

            add(drop, x, 0);
            cnt++;
            //System.out.println(cnt + " raindrop added at (" + x + ", 0)");
         }
      }
   }

   /*
   Check if there is overlapping raindrops at all 4 corners of the given rain
   drop o. This still doesn't not prevent completely raindrops from overlapping.
   Can you see why?

   This code can be simplified using OR. Can you try?
    */
   boolean hasOverlappingRaindrop(GOval o) {
      if (getElementAt(o.getX(), o.getY()) != null) {
         return true;
      } else if (getElementAt(o.getX() + SZ, o.getY()) != null) {
         return true;
      } else if (getElementAt(o.getX() + SZ, o.getY() + SZ) != null) {
         return true;
      } else if (getElementAt(o.getX(), o.getY() + SZ) != null) {
         return true;
      } else {
         return false;
      }
   }

   public void keyPressed(KeyEvent e) {
      if(e.getKeyCode() == KeyEvent.VK_SPACE) {
         hasPaused = !hasPaused;
      }
   }

   static final int SZ = 5;

}