package Practice.VS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class TwoSum
{
    public static int[] twoSum(int[] num, int targets)
    {
        int a[] = new int[4];
        for(int i=0;i<num.length; i++)
        {
            for(int j=i+1;j<num.length; j++)
            {
                if((num[i] + num[j]) == targets)
                {
                    a = new int[]{i, j};
                }
            }
        }
        return a;
    }

    public static void usingQuickSort()
    {
        int target = 19;
        int ar[] = {16, 4, 23, 8, 15, 42, 1, 2};

        int[] ar1 = ar;
        Arrays.sort(ar1);
        int low = 0;
        int high = ar.length -1;

        while (low<high)
        {
            int val = ar1[low] + ar1[high];
            if(val == target)
            {
//                int a[] = {low, high};
                int finalLow = low;
                int finalHigh = high;
                System.out.println(ar1[finalLow]);
                System.out.println(ar1[finalHigh]);
                int aa = IntStream.range(0, ar.length).filter(x -> ar1[finalLow] == ar[x]).findFirst().orElse(-1);
                int bb = IntStream.range(0, ar.length).filter(y -> ar[y]== ar1[finalHigh]).findFirst().orElse(-1);
                System.out.println(aa +" "+ bb);
                break;
            }
            else
            {
                if(val > target)
                {
                    high--;
                }
                else
                {
                    low++;
                }
            }

        }

        outer:
        for(int i=0; i<ar.length; i++)
        {
            for(int j=ar.length -1; j>=0; j--)
            {
                int val = ar[i] + ar[j];
                if(val==target)
                {
                    System.out.println(i+ " "+j);
                    break outer;
                }
                else
                {
                    if(val>target)
                        break ;
                }
            }
        }
    }


    public static void test12()
    {
        int ar[] = {16, 4, 23, 8, 15, 42, 1, 2};

        Map<Integer, Integer> mp = new HashMap<>();
        int target = 19;
        int i = 0;
        while (i<ar.length)
        {
            int complement = Math.abs(target - ar[i]);
            if(mp.containsKey(complement))
            {
                System.out.println(mp.get(complement) +" " +i);
            }
            mp.put(complement, i);
            i++;
        }

    }
    public static void main(String[] args) {
        int ar[] = {2, 7, 11, 15, 5, 4};
//        System.out.println(Arrays.toString(twoSum(ar, 9)));

//        usingQuickSort();
        test12();
    }
}
