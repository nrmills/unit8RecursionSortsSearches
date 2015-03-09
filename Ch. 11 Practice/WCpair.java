import java.util.Scanner;

public class WCpair
{
    public static void main(String[] args)
    {
        int count = 0;
        //Get file name
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name of file: ");
        String fileName = in.next();
        
        File inputFile = new InputFile("input.txt");
        in = new Scanner(inputFile);
        while(in.hasNext())
        {
            count++;
        }
        System.out.println("Number of characters: "+count);
    }
    in.close();
}