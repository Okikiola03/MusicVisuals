package C20357171;

import ie.tudublin.Visual;
import ie.tudublin.VisualException;
import ie.tudublin.*;
import processing.core.*;

public class dunno extends Visual{
    

    int dim;

    public void setup() {
      size(640, 360);
      dim = width/2;
      background(0);
      colorMode(HSB, 360, 100, 100);
      noStroke();
      ellipseMode(RADIUS);
      frameRate(1);
    }
    
    public void draw() {
      background(0);
      for (int x = 0; x <= width; x+=dim) {
        drawGradient(x, height/2);
      } 
    }
    
    public void drawGradient(float x, float y) {
      int radius = dim/2;
      float h = random(0, 360);
      for (int r = radius; r > 0; --r) {
        fill(h, 90, 90);
        ellipse(x, y, r, r);
        h = (h + 1) % 360;
      }
    }
    
}