package Practice;

import java.util.Random;

public class CheckPrimeOrNot
{
    public static void main(String[] args) {
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
