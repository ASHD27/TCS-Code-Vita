/**
 *  @author wasitshafi
 *  @since 18-07-20
 */
import java.util.Arrays;
import java.util.Scanner;

public class DoleOutCadbury
{
    public static long totalCadbury(long l, long w, long total)
    {
        if(l == w)
            return total + 1;
        else
        {
            if(l < w)
                return totalCadbury(l, w - l, total+1);
            else
                return totalCadbury(l - w, w, total+1);
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        long p = scanner.nextLong();
        long q = scanner.nextLong(); // p < q
        long r = scanner.nextLong();
        long s = scanner.nextLong(); // r < s
        long sum = 0;

        for(long i = p ; i <= q ; i++)
            for(long j = r ; j <= s ; j++)
                sum += totalCadbury(i, j, 0);

        System.out.print(sum);
        scanner.close();
    }
}