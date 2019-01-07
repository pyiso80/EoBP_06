import acm.graphics.GCompound;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Car2 extends GraphicsProgram {
   public void run() {

      setBackground(Color.YELLOW);
      GCompound car = new GCompound();
      GRect body = new GRect(10, 30, 100, 50);
      body.setFilled(true);
      body.setFillColor(Color.BLUE);
      car.add(body);
      GOval wheel1 = new GOval(20, 70, 20, 20);
      wheel1.setFilled(true);
      wheel1.setFillColor(Color.RED);
      car.add(wheel1);
      GOval wheel2 = new GOval(80, 70, 20, 20);
      wheel2.setFilled(true);
      wheel2.setFillColor(Color.RED);
      car.add(wheel2);
      GRect windshield = new GRect(80, 40, 30, 20);
      windshield.setFilled(true);
      windshield.setFillColor(Color.CYAN);
      car.add(windshield);
      add(car);

   }
}