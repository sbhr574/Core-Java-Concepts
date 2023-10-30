package Practice.Oracle_Health;

import java.util.Arrays;

/**
 * XOR logic <a href="https://www.youtube.com/watch?v=KNOw_goVGas&list=PLFdAYMIVJQHMap2jOyU6-kHjQEL-vxlV2&index=9">...</a>
 */
public class Find_NonRepeating_num
{
    public static int getNum(int[] num)
    {
        int n = num[0];

        for (int i=1; i< num.length; i++)
        {
            n = n ^ num[i];
        }

        return n;
    }

    private static void fun12(int[] ar)
    {
        int[] a = ar.clone();

        if(a.length < 2)
        {
            return;
        }

        Arrays.sort(a);
        int h = Integer.MIN_VALUE;
        int sh = Integer.MIN_VALUE;

        for(int i= a.length - 1; i>0; i--)
        {
            if(h<a[i])
            {
                sh = h;
                h = a[i];
            }
            else if(sh < a[i])
            {
                sh = a[i];
            }
        }
        System.out.println(sh);

    }

    public static void main(String[] args) {
        int[] arr = {19,8,8 ,2,2,5,15,21,22};
//        System.out.println(getNum(arr));
        fun12(arr);
    }
}
