
public class SelectionSorter
{
    public static void sort( int[] a )
    {
        //repeatedly scan the unsorted portion of the array to find the smallest value, then swap it
        for( int i = 0; i < a.length - 1; i++ )
        {
            //scan through the unsorted portion of the array and find the smallest
            //value; update the smallest value and the index of that element
            int smallestValue = a[i];
            int smallestIndex = i;
            for( int j = 0; j < a.length; j++ )
            {
                if( a[j] < a[i] )
                {
                    smallestValue = a[j];
                    smallestIndex = j;
                }
            }

            //swap the smallest value with the element at the beginning of the
            //unsorted portion of the array
            int temp = a[i];
            a[i] = a[smallestIndex];
            a[smallestIndex] = temp;
        }
    }
    
    public static void main( String[] args )
    {
        int[] a = new int[20];
        for( int i = 0; i < a.length; i++ )
        {
            a[i] = (int)(Math.random() * 100);
        }
        
        System.out.println( Arrays.toString( a ));
        
        sort( a );
        
        System.out.println( Arrays.toString( a ));
    }
}