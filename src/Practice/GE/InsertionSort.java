package Practice.GE;

import java.util.Arrays;

public class InsertionSort
{
    public static void test1()
    {
        int ar[] = {50, 3, 9, 2, 15, 7, 33, 4, 1};
        for(int i=0;i<ar.length-1; i++)
        {
            int j = i+1;
            while (j<ar.length)
            {
                if(ar[i] > ar[j])
                {
                    int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
                j++;
            }
        }
        System.out.println(Arrays.toString(ar));
    }

    public static void selectionSort()
    {
        int ar[] = {50, 3, 9, 2, 15, 7, 33, 4, 1};

        for(int i=0;i<ar.length; i++)
        {
            int low = i;
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[low]>ar[j])
                {
                    low = j;
                }
            }
            if(ar[low] != ar[i])
            {
                int temp = ar[i];
                ar[i] = ar[low];
                ar[low] = temp;
            }
        }
        System.out.println(Arrays.toString(ar));
    }

    public static void main(String[] args) {
        test1();
        selectionSort();
    }
}
