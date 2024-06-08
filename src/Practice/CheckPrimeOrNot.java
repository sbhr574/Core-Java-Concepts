package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CheckPrimeOrNot
{

    /**
     * Below logic is to check on range
     */
    private static void test()
    {
        int start = 1;
        List<Integer> prime = new ArrayList<>();

        while(start<=20)
        {
            boolean val = true;

            if (start != 0 || start != 1) {
                for (int i = 2; i < start; i++) // line 23 to 28 is the main logic to check the prime number. Its simple and good logic for interview.
                {
                    if (start % i == 0)
                    {
                        val = false;
                    }
                }
            }
            if (val) prime.add(start);
            start++;
        }
        System.out.println(prime);
    }

    public static void main(String[] args)
    {
        test();

        
        Random random = new Random();
        int num = random.nextInt(3);
        int count = 0;

        if(!(num<=1))
        {
            for(int i=1;i<=num;i++)
            {
                if(num%i==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.format("Num %s a prime number.".formatted(num));
            }
            else
            {
                System.out.format("Num %s not a prime number.".formatted(num));
            }

        }
        else
        {
            System.out.format("Num %s not a prime number.".formatted(num));
        }

    }
}
