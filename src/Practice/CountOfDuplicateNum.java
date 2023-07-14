package Practice;

import java.util.Arrays;

public class CountOfDuplicateNum
{
    public static void getCount()
    {
        int[] numbers = new int[]{2,3,3,4,1,2,4,2, 0};
        Arrays.sort(numbers);
        int num = 0;
        for(int i=0; i<numbers.length; i++) {
            int count = 0;
            if (num == numbers[i]) {

            }
                for (int j = i + 1; j < numbers.length; j++)
                {
                    if (numbers[j] == numbers[i]) {
                        count++;
                    }
                }
                System.out.println("Number " + numbers[i] + " count " + count);
                num = numbers[i];
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{2,3,3,4,1,2,4,2,0};
        int[] num = new int[numbers.length];
        Arrays.sort(numbers);
        int count = numbers[0];

        for(int i = 0; i < numbers.length - 1; i++)
        {
            int cnt = 1;
            if(i != 0 && count != numbers[i])
            {
                count = numbers[i];
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        cnt++;
                    }
                }
                System.out.format("\nnum %s count : %s".formatted(numbers[i], cnt));
            }
        }
    }
}
