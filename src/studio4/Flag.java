package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		StdDraw.setCanvasSize(1000,1000);
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledCircle(.5, .5, .2);
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledCircle(.5, .5, .05);
	}
}