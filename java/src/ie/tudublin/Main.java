package ie.tudublin;

import C20357171.WaveForm;
import C20357171.WaveForm7;
import C20357171.OkikiolaVisual;
import C20357171.Okikiola1;
import C20357171.RotatingAudioBands;
import C20357171.dunno;
import processing.core.PApplet;

//main
public class Main
{	

	public void startUI()
	{
		String[] a = {"MAIN"};
		processing.core.PApplet.runSketch( a, new Okikiola1());		
	}

	public static void main(String[] args)
	{
		Main main = new Main();
		main.startUI();			
	}
}