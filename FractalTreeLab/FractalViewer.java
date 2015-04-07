import javax.swing.JFrame;

public class FractalViewer
{
    private static int WIDTH = 1680;
    private static int HEIGHT = 1080;
    
    private static JFrame frame;
    public static void main( String[] args )
    {
        frame = new JFrame();
        
        frame.setSize(HEIGHT,WIDTH);
        frame.setTitle("Fractal Tree");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FractalComponent component = new FractalComponent( 90, -20, 840, 1080, 840, 980 );
        frame.add(component);
        
        frame.setVisible(true);
    }   
}