import java.util.Scanner;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import java.lang.Math;

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
        int curAngle = angle - angleMod;
        int newLength = math.sqrt( math.pow(x2-x1) + math.pow(y2-y1) )*3.0/4.0;
        
        //determines new leg length
        int deltaX = (x2-x1)*3.0/4.0;
        int deltaY = (y2-y1)*3.0/4.0;
        
        //Assign the values of the given point
        int x3 = x2+deltaX;
        int y3 = y2+deltaY;
        
        //Use trigonometry to find (X4,Y4)
        int x4 = cos(60) * newLength;
        
        int newX1
    


