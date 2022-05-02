package c20362766;

import processing.core.*;

public class CircleVisual {
    HabeebsVisuals mv;
    float cy = 0;
    float cx = 0;

    public CircleVisual(HabeebsVisuals mv) {
        this.mv = mv;
        cy = this.mv.height / 2;
        cx = this.mv.width / 2;
    }

    public void render() {
        mv.colorMode(PApplet.HSB);

        for (int i = 0; i < mv.getAudioBuffer().size(); i++) {
            // changes color to rainbow range
            mv.stroke(PApplet.map(i, 0, mv.getAudioBuffer().size(), 0, 255), 255, 255);

            mv.fill(PApplet.map(i, 0, mv.getAudioBuffer().size(), 0, 255), 255, 255);
            // mv.ellipse(cx, cy, 300, 150);

            mv.ellipse(cx, cy, 30000 * mv.getAudioBuffer().get(i), 15000 * mv.getAudioBuffer().get(i));

            // mv.circle(cx, cy, 2000 * mv.getAudioBuffer().get(i));

        }
    }
}