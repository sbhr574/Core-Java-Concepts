package Practice.ThermoFisher;

public class Find_Second_highest
{
    public static void main(String[] args)
    {
        int[] ar = {12, 23, 14, 25, 17, 18};

        int first_h = Integer.MIN_VALUE;
        int sec_h = Integer.MIN_VALUE;

//        for(int i=1; i<ar.length; i++)
//        {
//            if(first_h < ar[i])
//            {
//                sec_h = first_h;
//                first_h = ar[i];
//                continue;
//            }
//
//            if((sec_h < ar[i]) && (first_h != ar[i]))
//            {
//                sec_h = ar[i];
//            }
//        }
//
//        System.out.println(first_h + " - "+ sec_h);


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
}
