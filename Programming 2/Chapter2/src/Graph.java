import java.awt.geom.Line2D;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.util.Random;

public class Graph {

	private static void drawBar (Graphics2D g2, Day d, Day today, int offset, String label) {
			int gheight = d.daysFrom(today)*2;
			Random generator = new Random();
			Color c = new Color(generator.nextInt(50), generator.nextInt(150), generator.nextInt(150));
			g2.setColor(c);
			g2.fillRect(75+offset*125, 700-gheight, 100, gheight);
			g2.drawString(label, 75+ offset*125, 715);
			
		}
		public static class BarsViewer extends JComponent{
			
		}
	}

