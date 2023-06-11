package Practice.VS;

public class Find_Second_Highest
{
    public static void test1(int ar[])
    {
        int h = ar[0];
        int sec_h = -1;
        int i = 1;
        while (i < ar.length)
        {
            if(ar[i]>h)
            {
                sec_h = h;
                h = ar[i];
            }
            i++;
        }
        if(sec_h<0)
        {
            System.out.println("There is no 2d highest");
        }
        else
            System.out.println(sec_h);
    }

    public static void main(String[] args) {
        int ar[] = {7,6,10,5,9,2,1,15,7};
        test1(ar);
    }
}
