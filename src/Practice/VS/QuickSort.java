package Practice.VS;

import java.util.Arrays;

public class QuickSort
{
    static void quicksort(int a[], int lb, int ub) {

        if (lb < ub)
        {
            int val = partition(a, lb, ub);
            System.out.println("1st sorting array - "+Arrays.toString(a)); //[13, 35, 50, 45, 70, 67, 90, 41]
            quicksort(a, lb, val-1); //after 1st sorting this recursion will take care of 1st part. Here lb=13, ub=val - 1 = j - 1 = 35
            quicksort(a, val+1, ub);//after 1st sorting this recursion will take care of 2nd part. Here lb=val + 1 = j + 1 = 45, ub=41
        }

        System.out.println("quick "+ Arrays.toString(a));
    }

    private static int partition(int ar[], int l, int h)
    {
        int pivot = ar[l];
        int i = l;
        int j = h;

        while (i<j)//will check till i getter than j
        {
            while (ar[i] <= pivot)//Will stop if found greater tha pivot
            {
                if(i==h) break;//this break is needed otherwise array bound of exception can throw
                i++;
            }
            while (ar[j] > pivot)
            {
                if(j==l) break; //this break is needed otherwise array bound of exception can throw
                j--;
            }

            if (i < j)
            {
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
            }
        }
        // below swap pivot and last value moved index need to. Here will find the partition
        int temp = ar[j];
        ar[j] = pivot;
        ar[l] = temp;

        return j;
    }

    public static void main(String[] args)
    {
        int ar[] = {35,50,13,45,70,67,90,41};
//        int ar[] = {7,6,10,5,9,2,1,15,7};
        quicksort(ar, 0, ar.length-1);
        System.out.println("Final result :: "+Arrays.toString(ar));
    }

}
