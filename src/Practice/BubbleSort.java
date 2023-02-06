package Practice;

import java.util.Arrays;

public class BubbleSort
{
    public static void main(String[] args)
    {
//        int a[] = {4,1,2,5,3};
//        int a[] = {2,8,3,1,6,4};
        int a[] = {15,8,23,3,9,32,78,21,5,5};

        int count = 0;
        while(count < a.length-1)
        {
            int c = a[0];
            count++;
            for(int i = 1; i<a.length; i++)
            {
                if(c > a[i])
                {
                    int b = a[i];
                    a[i] = c;
                    a[i - 1] = b;
                }
                else
                {
                    c = a[i];
                }
            }
            System.out.println(Arrays.toString(a));
        }

    }
}
