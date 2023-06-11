package Practice.VS;

import java.util.Arrays;

public class SelectionSort
{

    public static void test1(int ar[])
    {
        for(int i=1;i<ar.length; i++)
        {
            int temp = ar[i];
            int j = i - 1;
            while(j>=0 && ar[j]>temp)
            {
                ar[j+1] = ar[j];
                j--;
            }
            ar[j+1] = temp;
        }

        System.out.println(Arrays.toString(ar));
    }
    public static void test(int ar[])
    {
        for(int i=0; i<ar.length - 1; i++)
        {
            int min = i;
            for(int j=i+1; j< ar.length; j++)
            {
                if(ar[min]>ar[j]) min = j;
            }
            if(ar[min] != ar[i])
            {
                int temp = ar[i];
                ar[i] = ar[min];
                ar[min] = temp;
            }
            else {
                System.out.println("tes");
            }
        }
        System.out.println(Arrays.toString(ar));
    }

    public static void test3(int ar[], int find)
    {
        int low = 0;
        int high = ar.length - 1;
        int mid = (low + high)/2;
        while (low <= high)
        {

            if(ar[mid]==find) {
                System.out.println(mid);
                break;
            }
            if(find<ar[mid]) {
                high = mid - 1;
                mid = (low + high) / 2;
            }

            if(find>ar[mid]) {
                low = (mid+1);
                mid = (low + high) / 2;
            }
        }

    }

    public static void main(String[] args)
    {
        int ar[] = {35,50,13,45,70,67,90,41};
        int arr[] = {13, 35, 41, 45, 50, 67, 70, 90};
        test3(arr, 1);
    }

}
