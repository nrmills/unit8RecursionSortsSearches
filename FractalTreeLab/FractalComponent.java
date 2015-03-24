import java.util.Scanner;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import java.lang.Math;

public class FractalComponent extends JComponent
{
    private double xTop, yTop, xBottom, yBottom;

    public FractalComponent( double x1, double y1, double x2, double y2 )
    {
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
        drawFractalBranch( g2, xBottom, yBottom, xTop, yTop );
    }

    public void drawFractalBranch( Graphics2D g2, double x1, double y1, double x2, double y2)
    {

        double decX = x2 - ( x2 - (x2 * 3.0/4.0) );
        double incX = x2 + ( x2 - (x2 * 3.0/4.0) );
        double univY = y2 - ( y2 + (y1 * 3.0/4.0) );

        if( decX <= 0 ||
            incX >= 750 )
        {
            //int length = Math.sqrt( Math.pow(x2-x1) + Math.pow(y2-y1) );
            //int deltaX = x2-x1;
            //int deltaY = y2-y1;

            Line2D.Double dec = new Line2D.Double( x2, y2, decX, univY );
            Line2D.Double inc = new Line2D.Double( x2, y2, incX, univY );

            g2.draw(dec);
            g2.draw(inc);

            this.drawFractalBranch( g2, x2, y2, decX, univY );
            this.drawFractalBranch( g2, x2, y2, incX, univY );
        }
    }
}

