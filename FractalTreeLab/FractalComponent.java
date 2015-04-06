import java.util.Scanner;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import java.lang.Math;
import java.awt.Color;
import java.util.Random;

public class FractalComponent extends JComponent
{
    private double xTop, yTop, xBottom, yBottom;
    private int angle, angleMod;

    public FractalComponent( int initAngle, int initAngleMod, double x1, double y1, double x2, double y2 )
    {
        angle = initAngle;
        angleMod = initAngleMod;
        xTop = x2;
        yTop = y2;
        xBottom = x1;
        yBottom = y1;
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Line2D.Double trunk = new Line2D.Double( xTop, yTop, xBottom, yBottom );
        g2.draw(trunk);
        drawFractalBranch( g2, angle, xBottom, yBottom, xTop, yTop );
    }

    public void drawFractalBranch( Graphics2D g2, int angle, double x1, double y1, double x2, double y2)
    {
        double newLength = Math.sqrt( Math.pow(x2-x1, 2 ) + Math.pow(y2-y1, 2 ) )*6.0/7.0;
        if( newLength > 9 )
        {
        
            double x3 = x2 - (newLength * Math.cos(Math.toRadians(angle+20)));
            double y3 = y2 - (newLength * Math.sin(Math.toRadians(angle+20)));
            
            double x4 = x2 - (newLength * Math.cos(Math.toRadians(angle-20)));
            double y4 = y2 - (newLength * Math.sin(Math.toRadians(angle-20)));

            Line2D.Double neg = new Line2D.Double(x2,y2,x3,y3);
            Line2D.Double pos = new Line2D.Double(x2,y2,x4,y4);
            
            Random posGenerator = new Random();
            
            int red = posGenerator.nextInt(255);
            int green = posGenerator.nextInt(255);
            int blue = posGenerator.nextInt(255);
            
            int[] posArray = { red, green, blue };
            
            red = posGenerator.nextInt(255);
            green = posGenerator.nextInt(255);
            blue = posGenerator.nextInt(255);
            
            int[] negArray = { red, green, blue };
            
            Color negColor = new Color( negArray[0], negArray[1], negArray[2] );
            Color posColor = new Color( posArray[0], posArray[1], posArray[2] ); 
            
            
            g2.setColor( negColor ); 
            g2.draw(neg);
            g2.setColor( posColor );
            g2.draw(pos);
            
            drawFractalBranch( g2, angle+25, x2, y2, x3, y3 );
            drawFractalBranch( g2, angle-20, x2, y2, x4, y4 );
        }
    }
}

