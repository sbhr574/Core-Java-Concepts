package Practice.VS;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Find_First_UniqueChar
{
    public static void test()
    {
        int index = -1;
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

        for(int i=0; i<ch.length; i++)
        {
            if(mp.get(ch[i])==1)
            {
                index = i;
                break;
            }
        }

        System.out.println(index);

    }

    public static void main(String[] args) {
        test();
    }
}
