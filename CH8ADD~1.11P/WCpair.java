import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class WCpair
{
    public static void main(String[] args)
    {
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name of file: ");
        String fileName = in.next();

        File inputFile = new File(fileName);
        try
        {
            Scanner fileInput = new Scanner(inputFile);
            while(fileInput.hasNext())
            {
                fileInput.next();
                count++;
            }
        }
        catch( FileNotFoundException exception )
        {
            in = new Scanner(System.in);
            System.out.print("ERROR: NAME NOT FOUND\nEnter name of file: ");
            String fileName = in.next();
        }

        System.out.println("Number of characters: "+count);
        in.close();
    }    
} 