package ie.tudublin;
import c20362766.HabeebsVisuals;
import c20362766.WaveForm7;
import processing.core.PApplet;
//import C20357171.*; 

public class Main {

	public void startUI() {
		String[] a = { "MAIN" };		
		processing.core.PApplet.runSketch(a, new HabeebsVisuals());
		//processing.core.PApplet.runSketch( a, new Okikiola1());		

	}

	public static void main(String[] args) {
		Main main = new Main();
		main.startUI();
	}
} // end main()