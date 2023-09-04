package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Instream_Concept
{
    public static void main(String[] args)
    {
        int []k = {12, 13, 11, 15};
        List<Integer> lst = new ArrayList<>();
        IntStream stm = IntStream.of(12, 13, 11, 15);
        lst.add(3);
        lst.add(1);
        lst.add(5);
        lst.add(30);
        lst.add(2);
        int ff = IntStream.range(0, k.length).filter(x->k[x]==12).findFirst().orElse(-1);
        int f = IntStream.range(0, lst.size()).filter(x->lst.get(x).equals(2)).findFirst().orElse(-1);
        System.out.println(f);
/**
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        StringBuilder b = new StringBuilder(str);

        String lps = "";

        for(int i=1; i<str.length(); i++)
        {
            int low = i;
            int high = i;

            while (str.charAt(low) == str.charAt(high))
            {
                low--;
                high++;

                if(low<0 || high==str.length())
                {
                    break;
                }
            }

            String st = str.substring(low+1, high);
            if(st.length()>lps.length())
            {
                lps = st;
            }

            low = i - 1;
            high = i;

            while (str.charAt(low) == str.charAt(high))
            {
                low--;
                high++;

                if(low<0 || high == str.length())
                {
                    break;
                }
            }

            st = str.substring(low+1, high);
            if(st.length()>lps.length())
            {
                lps = st;
            }

        }

        System.out.println(lps);

*/
    }
}
