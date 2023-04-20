package Practice;

import java.util.Arrays;

public class BinarySearch
{
    // Always should be in sorted order mandatory
    public static void main(String[] args)
    {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};

        Arrays.sort(arr);

        int num = 70; //Searching this number

        int f = 0;
        int l = arr.length - 1;

        while (f<=l)
        {
            int mid = (f+l)/2;
            if(arr[mid] == num)
            {
                System.out.println("found it from mid");
                break;
            }
            else
            {
                if((arr[mid] < num))
                {
                    f = mid + 1;
                }
                else
                {
                    l = mid - 1;
                }
            }
        }
    }
}
