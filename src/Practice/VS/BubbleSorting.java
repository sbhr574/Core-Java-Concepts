package Practice.VS;

import java.util.Arrays;

public class BubbleSorting
{
    public static void bubbleSort(int ar[])
    {
        int n = ar.length;
        for(int i=0; i<n-1; i++)
        {
            boolean isSwap = false;
            for(int j=0; j < n-1-i; j++)
            {
                if(ar[j+1]<ar[j])
                {
                    isSwap = true;
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
            if(!isSwap)
                break;
        }
        System.out.println(Arrays.toString(ar));
    }
    public static void main(String[] args)
    {
        int arr[] = {12, 9, 2, 24, 45, 129, 234, 127, 200};
        bubbleSort(arr);
    }
}
