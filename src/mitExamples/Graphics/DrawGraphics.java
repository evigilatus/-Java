package mitExamples.Graphics;

import java.awt.Color;
import java.awt.Graphics;

public class DrawGraphics {
	BouncingBox[] box = new BouncingBox[3];

	/** Initializes this class for drawing. */
	public DrawGraphics() {
		box[0] = new BouncingBox(200, 200, Color.CYAN);
		box[1] = new BouncingBox(100,100, Color.CYAN);
		box[2] = new BouncingBox(150,150, Color.BLUE);
		
		//box[2].setMovementVector(-1, -1);
		box[1].setMovementVector(-2, -2);
		box[0].setMovementVector(2, 2);
	}

	/** Draw the contents of the window on surface. Called 20 times per second. */
	public void draw(Graphics surface) {
		surface.drawRect(50, 50, 200, 200);
		surface.drawLine(50, 50, 250, 250);
		for(int i=0; i<box.length;i++) {
			box[i].draw(surface);
		}
		
	}
}