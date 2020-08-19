/**
 *  @author wasitshafi
 *  @since 18-07-20
 */
import java.util.Arrays;
import java.util.Scanner;

public class DigitPairs
{
    public static int pairsFrom(int n)
    {
        if(n == 2)
            return 1;
        else if(n >= 3)
            return 2;
        else
            return 0;
    }

    public static void main(String[] args)
    {
        int n, rem;
        Scanner scanner = new Scanner(System.in);
        
        n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++) arr[i] = scanner.nextInt();
        int digits[] = new int[3];
        for(int i = 0 ; i < n ; i++)
        {
            digits[0] = arr[i] % 10;
            arr[i] = arr[i] / 10;

            digits[1] = arr[i] % 10;
            arr[i] = arr[i] / 10;

            digits[2] = arr[i] % 10;
            arr[i] = arr[i] / 10;

            Arrays.sort(digits);
            arr[i] = (digits[2] * 11 + digits[0] * 7) % 100;
        }

        int msb;
        int odd_freq[] = new int[10];
        int even_freq[] = new int[10];

        Arrays.fill(odd_freq, 0);
        Arrays.fill(even_freq, 0);
        for(int i = 0 ; i < n ; i++)
        {

            msb =  arr[i] / 10;
            if((i +1) % 2 == 0)
                even_freq[msb]++;
            else
                even_freq[msb]++;
        }

        int countPairs[] = new int[10];
        Arrays.fill(countPairs, 0);
        for(int i = 0 ; i < 10 ; i++)
        {
            if(even_freq[i] <= 1 && odd_freq[i] <= 1)
                continue;
            countPairs[i] += pairsFrom(even_freq[i]) + pairsFrom(odd_freq[i]);
            countPairs[i] = 2 < countPairs[i] ? 2 : countPairs[i];  
        }

        int sum = 0;
        for(int i= 0 ; i < 10 ; i++) sum += countPairs[i];
        System.out.print(sum);
        scanner.close();
    }
}