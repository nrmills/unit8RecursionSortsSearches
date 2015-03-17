import java.util.ArrayList;
import java.util.*;

public class ListMethods
{
    public static ArrayList makeList(int n)
    {
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        if (n <= 0)  // The smallest list we can make
        {
            return tempList;
        }

        tempList = makeList(n-1);
        tempList.add(n);

        return tempList;
    }
}