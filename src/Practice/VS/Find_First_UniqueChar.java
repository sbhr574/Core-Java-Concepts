package Practice.VS;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Find_First_UniqueChar
{
    public static void test()
    {
        String ct = "FourMyFourMyHouse";
        Map<Character, Integer> mp = new HashMap<>();
        char [] ch = ct.toCharArray();
        for(char c : ch)
        {
            if(mp.containsKey(c))
            {
                mp.put(c, mp.get(c) + 1);
            }
            else
            {
                mp.put(c, 1);
            }
        }

        for(char c: ch)
        {
            if(mp.get(c)==1)
            {
                System.out.println(c);
                break;
            }
        }

//        Set<Map.Entry<Character, Integer>> dn = mp.entrySet();
//        for (Map.Entry en : dn)
//        {
//
//        }

    }

    public static void main(String[] args) {
        test();
    }
}
