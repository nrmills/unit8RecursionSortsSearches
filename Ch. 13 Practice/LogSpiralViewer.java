//Nic Mills
import java.awt.Graphics;
import javax.swing.JFrame;

public class LogSpiralViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        
        frame.setSize(1500,1000);
        frame.setTitle("Fibonacci Spiral");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        LogSpiralPanel p1 = new LogSpiralPanel();
        frame.add(p1);
        frame.setVisible(true);
        
        
    }
}