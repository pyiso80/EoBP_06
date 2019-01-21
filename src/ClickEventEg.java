import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;


import java.awt.Color;
import java.awt.event.MouseEvent;

public class ClickEventEg extends GraphicsProgram {
   public void run() {


   }

   /*

   This is the listener method for mouse click events. This method will be called
   by the runtime system whenever the mouse is clicked inside the canvas area.

   When the listener method is called when the mouse is clicked, the argument e
   containing information about the click event such as x and y coordinates of
   the mouse click point.

   Try changing the method name to mousePressed and mouseReleased. And observe
   how different listeners responds differently.

    */

   public void mouseClicked(MouseEvent e) {
      double x = e.getX();
      double y = e.getY();

      GOval o = new GOval(x, y, 20, 20);
      add(o);

      o.setFilled(true);
      Color c = new Color(RandomGenerator.getInstance().nextInt(0, 255),
                           RandomGenerator.getInstance().nextInt(0, 255),
                           RandomGenerator.getInstance().nextInt(0, 255));
      o.setFillColor(c);
   }


}