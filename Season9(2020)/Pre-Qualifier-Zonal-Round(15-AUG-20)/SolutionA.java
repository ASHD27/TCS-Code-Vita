/**
 * @author wasitshafi
 * @since 16-AUG-20
 */
import java.util.Scanner;

// Wrong Answer to Private Test Cases
public class SolutionA
{
    public static void main(String[] args)
    {
        int res = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
  
        scanner.nextLine();
        String wall[] = new String[n];
      
        for (int i = 0 ; i < n ; i++)
            wall[i] = new String("");
      
        for (int i = 0 ; i < n ; i++)
        	wall[i] = scanner.nextLine().replaceAll(" ", "");
        
        for (int i = 0 ; i < n ; i++)
            for(int j = 0; j < n ; j++)
                if(wall[i].charAt(j) == 'D')
                    res++;
        
        System.out.print((int)Math.floor(Math.sqrt(res)));
        scanner.close();
    }
}