package Practice.LeetCode;

/**
 * Logic is simple and please check the video for better understand
 * <a href="https://www.youtube.com/watch?v=xc9T_OczWQc">...</a>
 */
public class AddBinary
{
    public static String addBinary(String a, String b)
    {
        int aa = a.length() - 1;
        int bb = b.length() - 1;
        int carry =0;
        StringBuilder result = new StringBuilder();

        while (aa>=0 || bb>=0)
        {
            int t1 = 0,t2 = 0, sum;
            if(aa>=0)
            {
                t1 = a.charAt(aa--)-'0'; //Here its reducing the index
            }
            if(bb>=0)
            {
                t2 = b.charAt(bb--)-'0'; //0 has 48 ascii value and for 1 49
            }
            sum = t1+t2+carry;
            if(sum>=2)
            {
                carry = 1;
                sum = sum - 2;
            }
            else
            {
                carry = 0;
            }
            result.append(sum);
        }
        if(carry==1)
            result.append(carry);
        return result.reverse().toString();
    }

    public static void main(String[] args)
    {
        String val = addBinary("11", "1");
        System.out.println(val);
    }
}
