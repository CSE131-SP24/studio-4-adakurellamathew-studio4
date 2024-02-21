package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
			StdDraw.setPenRadius(0.02);
	        StdDraw.setPenColor(StdDraw.BLACK);
	        StdDraw.rectangle(0.5, 0.5, 0.4, 0.3);
	        
	        StdDraw.setPenColor(StdDraw.GREEN);
	        StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.3);
	        
	        StdDraw.setPenColor(StdDraw.YELLOW);
	        double[] x = { 0.2, 0.8, 0.7, 0.3 };
	        double[] y = { 0.4, 0.4, 0.6, 0.6 };
	        StdDraw.filledPolygon(x, y);
	}
}
