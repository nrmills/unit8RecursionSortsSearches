import java.util.Scanner;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import java.lang.Math;
import java.awt.Color;

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
            
            g2.setColor(Color.RED);
            g2.draw(neg);
            g2.setColor(Color.BLUE);
            g2.draw(pos);
            
            drawFractalBranch( g2, angle+20, x2, y2, x3, y3 );
            drawFractalBranch( g2, angle-20, x2, y2, x4, y4 );
        }
    }
}

