//Nic Mills
import javax.swing.JFrame;

public class LogSpiralViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        
        frame.setSize(1500,800);
        frame.setTitle("Fibonacci Spiral");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        LogSpiralPanel p1 = new LogSpiralPanel();
        frame.add(p1);
        frame.setVisible(true);
        
        p1.recursiveDraw( 750.0, 400.0, 34.0, 90 );
        
        
    }
}