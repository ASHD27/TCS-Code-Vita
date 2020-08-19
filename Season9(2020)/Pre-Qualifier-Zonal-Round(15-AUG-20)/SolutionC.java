/**
 * @author wasitshafi
 * @since 16-AUG-20
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

// Incomplete Solution
public class SolutionC
{
    public static int countVowels(String s)
    {
        int len = s.length();
        int count = 0;
        for(int i = 0 ; i < len ; i++)
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' ||s.charAt(i) == 'u' )
                count++;
        return count;
    }
    
    public static int stringPair(int arr[])
    {
        System.out.print("arr : " + Arrays.toString(arr));
        HashMap<Integer, String> numbers = new HashMap<>();
        HashMap<Integer, Integer> vowels = new HashMap<>();
        
        numbers.put(0,"zero");
        numbers.put(1,"one");
        numbers.put(2,"two");
        numbers.put(3,"three");
        numbers.put(4,"four");
        numbers.put(5,"five");
        numbers.put(6,"six");
        numbers.put(7,"seven");
        numbers.put(8,"eight");
        numbers.put(9,"nine");
        numbers.put(10,"ten");
        
        numbers.put(11,"eleven");
        numbers.put(12,"twelve");
        numbers.put(13,"thirteen");
        numbers.put(14,"fourteen");
        numbers.put(15,"fifteen");
        numbers.put(16,"sixteen");
        numbers.put(17,"seventeen");
        numbers.put(18,"eighteen");
        numbers.put(19,"nineteen");
        numbers.put(20,"twenty");
        
        
        numbers.put(21,"twenty-one");
        numbers.put(22,"twenty-two");
        numbers.put(23,"twenty-three");
        numbers.put(24,"twenty-four");
        numbers.put(25,"twenty-five");
        numbers.put(26,"twenty-six");
        numbers.put(27,"twenty-seven");
        numbers.put(28,"twenty-eight");
        numbers.put(29,"twenty-nine");
        numbers.put(30,"thirty");
        
        numbers.put(31,"thirty-one");
        numbers.put(32,"thirty-two");
        numbers.put(33,"thirty-three");
        numbers.put(34,"thirty-four");
        numbers.put(35,"thirty-five");
        numbers.put(36,"thirty-six");
        numbers.put(37,"thirty-seven");
        numbers.put(38,"thirty-eight");
        numbers.put(39,"thirty-nine");
        numbers.put(40,"forty");
        
        numbers.put(41,"forty-one");
        numbers.put(42,"forty-two");
        numbers.put(43,"forty-three");
        numbers.put(44,"forty-four");
        numbers.put(45,"forty-five");
        numbers.put(46,"forty-six");
        numbers.put(47,"forty-seven");
        numbers.put(48,"forty-eight");
        numbers.put(49,"forty-nine");
        numbers.put(50,"fifty");
        
        numbers.put(51,"fifty-one");
        numbers.put(52,"fifty-two");
        numbers.put(53,"fifty-three");
        numbers.put(54,"fifty-four");
        numbers.put(55,"fifty-five");
        numbers.put(56,"fifty-six");
        numbers.put(57,"fifty-seven");
        numbers.put(58,"fifty-eight");
        numbers.put(59,"fifty-nine");
        numbers.put(60,"sixty");
        numbers.put(61,"sixty-one");
        numbers.put(62,"sixty-two");
        numbers.put(63,"sixty-three");
        numbers.put(64,"sixty-four");
        numbers.put(65,"sixty-five");
        numbers.put(66,"sixty-six");
        numbers.put(67,"sixty-seven");
        numbers.put(68,"sixty-eight");
        numbers.put(69,"sixty-nine");
        numbers.put(70,"seventy");
        
        numbers.put(71,"seventy-one");
        numbers.put(72,"seventy-two");
        numbers.put(73,"seventy-three");
        numbers.put(74,"seventy-four");
        numbers.put(75,"seventy-five");
        numbers.put(76,"seventy-six");
        numbers.put(77,"seventy-seven");
        numbers.put(78,"seventy-eight");
        numbers.put(79,"seventy-nine");
        numbers.put(80,"eighty");
        
        numbers.put(81,"eighty-one");
        numbers.put(82,"eighty-two");
        numbers.put(83,"eighty-three");
        numbers.put(84,"eighty-four");
        numbers.put(85,"eighty-five");
        numbers.put(86,"eighty-six");
        numbers.put(87,"eighty-seven");
        numbers.put(88,"eighty-eight");
        numbers.put(89,"eighty-nine");
        numbers.put(90,"ninety");
        
        numbers.put(91,"ninety-one");
        numbers.put(92,"ninety-two");
        numbers.put(93,"ninety-three");
        numbers.put(94,"ninety-four");
        numbers.put(95,"ninety-five");
        numbers.put(96,"ninety-six");
        numbers.put(97,"ninety-seven");
        numbers.put(98,"ninety-eight");
        numbers.put(99,"ninety-nine");
        numbers.put(100,"hundred");
        numbers.put(100,"greater 100");
        for(int i = 0 ; i <= 100 ; i++)
            vowels.put(i,countVowels(numbers.get(i)));
            
        System.out.println(numbers);
        System.out.println(vowels);
        
        return 10;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0 ; i < n ; i++)
            arr[i] = scanner.nextInt();
            
        System.out.println(stringPair(arr));
        scanner.close();
    }
}