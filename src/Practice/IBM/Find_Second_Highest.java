package Practice.IBM;

public class Find_Second_Highest
{
    private static void find(int ar[])
    {

        int highest = ar[0];
        int second = Integer.MIN_VALUE;

        for(int i=1; i<ar.length; i++)
        {
            if(second < ar[i] )
            {
                if(highest < ar[i])
                {
                    second = highest;
                    highest = ar[i];
                }
                else
                {
                    second = ar[i];
                }
            }
        }
        System.out.println(second);

    }

    static int secondHighest(int [] nums) {
        int high1 = Integer.MIN_VALUE;
        int high2 = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > high1) {
                high2 = high1;
                high1 = num;
            } else if (num > high2) {
                high2 = num;
            }
        }
        return high2;
    }

    public static void main(String[] args) {
        int [] ar = {18, 79, 90, 34, 56, 34, 77, 88};
        int [] ar1 = {18, 79, 90, 34, 56, 34, 77, 88, 99};
        int [] ar2 = {181, 79, 90, 34, 56, 34, 77, 88, 99, 98};
        int [] ar3 = {18, 179, 90, 101, 34, 56, 34, 77, 88, 99};

//        find(ar);
//        find(ar1);
//        find(ar2);
//        find(ar3);
        System.out.println(secondHighest(ar));
        System.out.println(secondHighest(ar1));
        System.out.println(secondHighest(ar2));
        System.out.println(secondHighest(ar3));
    }
}
