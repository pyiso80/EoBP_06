/*
 * File: BouncingBall.java
 * -----------------------
 * This program graphically simulates a bouncing ball. */


import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class BouncingBall1 extends GraphicsProgram {

   static final int DIAM_BALL = 30;
   /**
    * Amount Y velocity is increased each cycle as a * result of gravity
    */
   static final double GRAVITY = 3;
   /**
    * Animation delay or pause time between ball moves
    */
   static final int DELAY = 50;
   /**
    * Initial X and Y location of ball
    */
   static final double X_START = DIAM_BALL / 2;
   static final double Y_START = 100;

   private static final double VEL = 5;
   /**
    * Amount Y Velocity is reduced when it bounces
    */
   private static final double BOUNCE_REDUCE = 0.9;

   public void run() {
      //starting x and y velocity
      double xVel = VEL;
      double yVel = VEL;
      GOval ball = new GOval(X_START, Y_START, DIAM_BALL, DIAM_BALL);
      ball.setFilled(true);
      add(ball);

      // Simulation ends when ball goes off right hand // end of screen
      while (ball.getX() < getWidth()) {
         if(hasHitFloor(ball)) {
               // change ball's Y velocity to now bounce upwards
               yVel = -yVel * BOUNCE_REDUCE;
               //find the distance from the floor to the ball lowest point
               //underneath the floor
               double diff = ball.getY() + DIAM_BALL - getHeight();
               //move the ball back to above the floor that same distance
               ball.move(0, -2 * diff);

         } else {
            yVel += GRAVITY;
            ball.move(xVel, yVel);
         }
         pause(DELAY);
      }
   }

   boolean hasHitFloor(GOval ball) {
      // determine if ball has dropped below the floor
      //return ball.getY() > getHeight() - DIAM_BALL;
      return (ball.getY() + DIAM_BALL) > getHeight();
   }
}

/*

 */

  