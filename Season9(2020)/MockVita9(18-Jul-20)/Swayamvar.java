/**
 *  @author wasitshafi
 *  @since 18-07-20
 */
import java.util.Arrays;
import java.util.Scanner;

public class Swayamvar
{
    public static void main(String[] args)
    {
        int n, ans = 0;
        Scanner scanner = new Scanner(System.in);
        String brides = "";
        String grooms = "";

        n = scanner.nextInt();
        scanner.nextLine();
        
        brides = scanner.nextLine();
        grooms = scanner.nextLine();

        int rCount = 0, mCount = 0;

        for(int i = 0 ; i < n ; i++)
        {
            if(grooms.charAt(i) == 'r')
                rCount++;
            else
                mCount++;
        }

        for(int i = 0 ; i < n ; i++)
        {
            if(brides.charAt(i) == 'r')
            {
                if(rCount == 0)
                {
                    ans = n - i;
                    break;
                }
                else
                    rCount--;
            }
            else
            {
                if(mCount == 0)
                {
                    ans = n - i;
                    break;
                }
                else
                    mCount--;
            }
        }
        System.out.print(ans);
        scanner.close();
    }
}