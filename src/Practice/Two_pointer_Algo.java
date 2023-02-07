package Practice;

import java.util.Arrays;

public class Two_pointer_Algo
{
    public static void main(String[] args)
    {
        int[] b = {-1,8, -3, 2, -5,6,9,4};

        System.out.println(twoSum(b, 1));

    }

    public static boolean twoSum(int[] a, int target)
    {
        Arrays.sort(a); //O(n log n)
        int start = 0;
        int end = a.length - 1;
        while (start < end)
        {
            int sum = a[start] + a[end];

            if(sum == target)
            {
                System.out.println(start);
                System.out.println(end);
                return true;
            }
            else
                if(sum < target)
                {
                    start++;
                }
                else
                {
                    end--;
                }
        }

        return false;
    }
}
