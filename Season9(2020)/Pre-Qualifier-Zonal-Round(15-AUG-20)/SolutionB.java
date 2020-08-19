/**
 * @author wasitshafi
 * @since  16-AUG-20
 */
import java.util.*;

public class SolutionB
{
    public static boolean checkIsPossible(int arr[])
    {
        int zeroCount ,oneCount , twoCount, rem, len = arr.length;

        zeroCount = oneCount = twoCount = 0;
        for(int i = 0 ; i < len ; i++)
        {
            rem = arr[i] % 3;
            if(rem == 0)
                zeroCount++;
            else if(rem == 1)
                oneCount++;
            else
                twoCount++;
        }
      
      	if((zeroCount == 0 && oneCount != 0 && twoCount != 0) || zeroCount > oneCount + twoCount + 1)
          return false;
     	else
          	return true;
        }

    public static void main(String[] args)
    {
        StringBuilder output = new StringBuilder("");
        Scanner scanner = new Scanner(System.in);
        int n, arr[], t = scanner.nextInt();

        while(t-- != 0)
        {
            n = scanner.nextInt();
            arr = new int[n];
            for(int i = 0 ; i < n ; i++)
                arr[i] = scanner.nextInt();

            if(checkIsPossible(arr))
                output.append("Yes");
            else
                output.append("No");
            if(t != 0)
                output.append("\n");
        }
        System.out.print(output);
        scanner.close();
    }
}