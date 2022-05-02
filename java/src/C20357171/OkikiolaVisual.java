package C20357171;

import ie.tudublin.*;

// This is an example of a visual that renders the waveform
public class OkikiolaVisual extends Visual
{
   WaveForm wf;


   public void settings()
    {
        size(800, 600);
        //fullScreen(P3D, SPAN);
    }

    public void setup() 
    {
        startMinim();
        // Call this instead to read audio from the microphone
        startListening();


        // new waveform instance
        wf = new WaveForm(this);
    }
    
    
    public void draw()    
    
    {

        background(0);
        try {
            // Call this if you want to use FFT data
            calculateFFT();
        } catch (VisualException e) {
            e.printStackTrace();
        }
        // Call this is you want to use frequency bands
        calculateFrequencyBands();
        // Call this is you want to get the average amplitude
        calculateAverageAmplitude();
        wf.render();
    }
}