package Practice.VS;

import java.util.*;

class A
{
    public void aa()
    {
        System.out.println("from aa");
    }
}
public class Prac2 extends A
{
    public void aa()
    {
        System.out.println("from Prac2");
    }

    public static void test1()
    {
        int []ar = {12, 11, 23, 45, 42, 56, 21, 22};
        Arrays.sort(ar);
        Map a = new HashMap();


        for(int i=0; i<ar.length; i++)
        {
            List aaa = new ArrayList();
            int f = ar[i];
            for(int j=i+1; j<ar.length; j++)
            {
                int s = ar[j];
                if((s - f) < 3 && (s - f) > 0)
                {
                    aaa.add(ar[j]);
                }
            }
            a.put(ar[i], aaa);
        }
        System.out.println(a);
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if(map.containsKey(current) && i - map.get(current) <= k) {
                return true;
            } else {
                map.put(current, i);
            }
        }

        return false;
    }

    /**
     * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
     *
     * For example:
     * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
     *
     * without any loop/recursion in O(1) runtime
     */
    public static void test2()
    {
        int num = 5555;
        while (num >10)
        {
            int temp = 0;
            while (num > 0)
            {
                temp = temp + num % 10;
                num = num / 10;
            }
            num = temp;
        }


        System.out.println(num);
    }

    public static int sumDigits(int num) {
        if (num < 10) {
            return num;  // base case: return the single digit
        } else {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;  // add the last digit to the sum
                num /= 10;  // remove the last digit
            }
            return sumDigits(sum);  // recursive call with the new sum
        }
    }

    public static void main(String[] args)
    {
        int []ar = {12, 11, 23, 45, 42, 56, 21, 22};

        System.out.println(sumDigits(55655));

    }
}
