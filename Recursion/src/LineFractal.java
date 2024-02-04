package Recursion.src;
import java.awt.BasicStroke;
import java.awt.Color;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.Random;






import java.awt.Graphics;
import javax.swing.JFrame;
public class LineFractal extends JFrame {
    private static final long serialVersionUID = 1L;
    int level;
    public LineFractal(int level) {
        this.level=level;
        setBounds(0, 0, 900, 900);
       // setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE)  ;  
    }
    public void paint(Graphics g) {
         drawFractal(level, 100, 100, 800, 100, g );    
    }
   
    // draw fractal recursively
    public void drawFractal( int level, int x1, int y1, int x2,
       int y2, Graphics g ){
        // base case: draw a line connecting two given points
       if ( level == 1 )
          g.drawLine( x1, y1, x2, y2 );
       else // recursion step: determine new points, draw next level
       {    
           //g.drawLine( x1, y1, x2, y2 );
           // calculate midpoint between (x1, y1) and (x2, y2)
          int x3 = ( x1 + x2 ) / 2;
          int y3 = ( y1 + y2 ) / 2;
          // calculate the fourth point (x4, y4) which forms an
          // isosceles right triangle between (x1, y1) and (x3, y3)
          // where the right angle is at (x4, y4)
          int x4 = x1 + ( x3 - x1 ) / 2 - ( y3 - y1 ) / 2;
          int y4 = y1 + ( y3 - y1 ) / 2 + ( x3 - x1 ) / 2;
     
          // recursively draw the Fractal
          drawFractal( level - 1, x4, y4, x1, y1, g );
          drawFractal( level - 1, x4, y4, x3, y3, g );
          drawFractal( level - 1, x4, y4, x2, y2, g );  
          //drawFractal( level - 1, x2, y2, x3, y3, g );  
       } // end else
    } // end method drawFractal

 
    public static void main(String[] args)
    {  
    LineFractal x = new LineFractal(10);
    // x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     x.setVisible(true);
    }
   
   
}
