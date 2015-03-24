import javax.swing.JFrame;

public class FractalViewer
{
    private static int WIDTH = 750;
    private static int HEIGHT = 750;
    
    private static JFrame frame;
    public static void main( String[] args )
    {
        frame = new JFrame();
        
        frame.setSize(HEIGHT,WIDTH);
        frame.setTitle("Fractal Tree");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FractalComponent component = new FractalComponent( 375.0, 740.0, 375.0, 700.0 );
        frame.add(component);
        
        frame.setVisible(true);
    }   
}