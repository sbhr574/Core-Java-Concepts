package LeetCode;

public class Search_Insert_Position
{
    private static int getIndex(int []ar, int target)
    {
        int start = 0;
        int len = ar.length-1;
        int mid = 0;
        while (start<=len)
        {
            mid = (start + len)/2;
            if(ar[mid]==target)
            {
                return mid;
            }
            else
            {
                if(ar[mid] > target)
                {
                    len = (mid - 1);
                }
                else
                {
                    start = (mid + 1);
                }
            }

        }
        if(ar[mid]>target)
            if(mid==0)
            {
                return mid;
            }
            else
                return mid-1;
        else
            return mid+1;
    }

    public static void main(String[] args) {
        int n[] = {1,3,5,6};
        System.out.println(getIndex(n, 0));
        var vd = new Search_Insert_Position();


    }
}
