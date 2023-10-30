package HackerRank;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Arrays;

/**
 * <a href="https://www.youtube.com/watch?v=sIzV1SDc-yQ&list=PLFdAYMIVJQHMap2jOyU6-kHjQEL-vxlV2&index=4">...</a>
 */
public class Array_Left_Rotation
{
    public static void reverse(int[] ar, int start, int end)
    {
        while(start<end)
        {
            int i = ar[start];
            ar[start] = ar[end];
            ar[end] = i;
            start++;
            end--;
        }
        System.out.print(Arrays.toString(ar));
    }

    public static void main(String[] args)
    {
        int[] arr = {7,0,8 ,2,5,4,6,3,5,3,1};
        reverse(arr, 0, 3);
        String er = "shgdybdjfjn";
        char[] ch = er.toCharArray();
        System.out.println(ch[3]);
    }
}
