import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
   * A program that uses variables to create a smiley face with the sky as the background and grass as the foreground.
   * @author: L. Wong
   */

  public void settings() {
	 
    // Indicating the size
    size(700, 400);
  }

  public void setup() {

    // Indicating the background
    background(96, 172, 235);
  }

  public void draw() {
	  
    // Draw the yellow circle for the head
    fill(245, 221, 66);
    ellipse(width / 2, height / 2, (float) (width * 0.375), (float) (height * 0.375));  

    // Draw the red mouth 
    fill(170, 0, 0);
    arc(width / 2, (float) (height * 0.55), (float) (width * 0.2), (float) (height * 0.125), 0, PI);
    line((float) (width * 0.4), (float) (height * 0.55), (float) (width * 0.6), (float) (height * 0.55));

    // Draw the white part of the eyes
    fill(255);
    ellipse((float) (width * 0.425), (float) (height * 0.45), (float) (width * 0.0875), (float) (height * 0.075));
    ellipse((float) (width * 0.575), (float) (height * 0.45), (float) (width * 0.0875), (float) (height * 0.075));

    // Draw the black pupils
    fill(0);
    ellipse((float) (width * 0.425), (float) (height * 0.45), (float) (width * 0.0375), (float) (height * 0.03));
    ellipse((float) (width * 0.575), (float) (height * 0.45), (float) (width * 0.0375), (float) (height * 0.03));

    // Draw the green foreground 
    fill(50, 184, 70);
    rect(0, (float) (height * 0.775), width, (float) (height * 0.225));
  }
  
}