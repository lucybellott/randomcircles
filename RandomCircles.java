package week2;

import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import acm.graphics.*;

public class RandomCircles extends GraphicsProgram {

private RandomGenerator rgen = new RandomGenerator();


	public void run() {
		
		for(int i=0; i<10; i++) {
		
		int radius = rgen.nextInt(5,50);
		int x = rgen.nextInt(0, getWidth());
		int y = rgen.nextInt(0, getHeight());
  
		GOval randomcircle = new GOval(x,y,radius,radius);
		randomcircle.setFilled(true);
		randomcircle.setFillColor(rgen.nextColor());
		add(randomcircle);

  }
	}
}
