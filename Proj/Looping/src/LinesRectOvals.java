import java.awt.*;
import javax.swing.*;
public class LinesRectOvals extends JFrame
{
    public LinesRectOvals()
    {
        super ("Drawing Lines, Rectangles, Ovals, Polygon");
        setSize(400,800);
        setVisible(true);
    }

	public void paint(Graphics g) {

		super.paint(g);
		
		g.drawString(" Drawing Examples", 150, 60);
		g.setColor(Color.RED);
		g.drawLine(5, 70, 350, 70);
		g.setColor(Color.BLUE);
		g.drawRect(5, 100, 90, 55);
		g.fillRect(100, 100, 90, 55);
		g.setColor(Color.GREEN);
		g.drawOval(5, 210, 90, 55);
		g.fillOval(100, 210, 90, 55);
		g.setColor(Color.YELLOW);
		g.draw3DRect(5, 310, 90, 55, false);

		g.draw3DRect(100, 310, 90, 55, true);

		// polygon
		int xValues[] = { 120, 270, 370, 270, 120, 20 };
		int yValues[] = { 400, 400, 500, 600, 600, 500 };
		Polygon hex = new Polygon(xValues, yValues, 6);
		g.setColor(Color.RED);
		//
		
		g.fillPolygon(hex);
		
		//Change the width of the paint stroke
		 Graphics2D g2d = ( Graphics2D ) g;
         g2d.setStroke(new BasicStroke(5));
         g.setColor(Color.GREEN);
         g.drawPolygon(hex);
	}
   public static void main(String args[])
   {
        LinesRectOvals application = new LinesRectOvals();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

