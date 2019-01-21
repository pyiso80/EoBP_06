import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.event.MouseEvent;

public class DragAndDrop extends GraphicsProgram {
   //to store current x and y coordinates of mouse pointer while dragging or
   //initially pressed.
   double xCur = 0;
   double yCur = 0;
   GRect rect = null;

   public void run() {
      add(new GRect(50, 50));
   }

   /*
   Dragging and moving objects is a little more involved.

   We need to listen for the mouse press event first. When the mouse is pressed
   and if there is a graphical object at the mouse pointer, we make `rect`
   instance variable refer to that object and store x and y coordinates of the
   point which the mouse pointer is.

   While the mouse button is pressed and start moving, mouseDragged listener
   method will be called. You can assume that every time the mouse pointer's
   position has changed while the mouse has been pressed, mouseDragged
   listener will get called. If the mouse changed in position by dx and dy,
   inside the mouseDragged listener, we move the selected object by the same
   amount as well.

   And when the mouse is released, we set `rect` iv (instance variable) back to
   null and xCur and yCur to 0. But note that even if we don't listen for
   mouseReleased event, the dragging will still work as expected. As an exercise,
   try to explain why it still works and if there is any advantages to having
   the mouseReleased listener methods like below.
    */

   public void mousePressed(MouseEvent e) {
      rect = getElementAt(e.getX(), e.getY());
      xCur = e.getX();
      yCur = e.getY();
      //System.out.println(xCur + ", " + yCur + " :Clicked");
   }

   public void mouseDragged(MouseEvent e) {
      //get the new mouse pointer's position
      double x = e.getX();
      double y = e.getY();
      //System.out.println(x + ", " + y + " :Dragged");
      if (rect != null) {
         //move the rectangle by the same amount
         rect.move(x - xCur, y - yCur);
         xCur = x;
         yCur = y;
      }
   }

   public void mouseReleased(MouseEvent e) {
      rect = null;
      xCur = 0;
      yCur = 0;
   }
}