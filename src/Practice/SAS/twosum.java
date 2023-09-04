package Practice.SAS;

import java.util.Arrays;

public class twosum
{
    private static boolean test(int x)
    {
        int org = x;
        int rev = 0;

        while(org > 0){
            int unit = org%10;
            rev = 10*rev+unit;
            org/=10;
        }

        return rev == x;
    }

    public static String longestCommonPrefix(String[] strs)
    {
        String sb = "";
        Arrays.sort(strs);

        if(strs.length==1)
        {
            return strs[0];
        }
        String first = strs[0];
        char ch[] = first.toCharArray();
        String sec = strs[strs.length-1];
        char ch1[] = sec.toCharArray();


        for(int i=0; i<ch.length; i++)
        {
            if(ch[i] == ch1[i])
            {
                sb = sb+ch[i];
            }
            else
            {
                break;
            }
        }
        return sb;

    }


    public static void main(String[] args) {
//        System.out.println(test(-121));
        String strs[] =
                {"a"};
        System.out.println(longestCommonPrefix(strs));
    }

}
