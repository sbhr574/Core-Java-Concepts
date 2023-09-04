package Practice.Publics_Sepient;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Find second-highest word from a string
 */
public class asked_question
{
    public static void main(String[] args) {

        String str = "aaaatwwwggfffhhhyehnsjd";

        //output = w,g,f

        HashMap<Character, Integer> fd = new HashMap<>();
        for(char ch : str.toCharArray())
        {
            Integer count = fd.get(ch);
            if(count == null)
            {
                fd.put(ch, 1);
            }
            else
            {
                fd.put(ch, count+1);
            }
        }
        System.out.println(fd);

        Set<Map.Entry<Character, Integer>> en = fd.entrySet();

        int fst = 0, sec = -1;
        for(Map.Entry<Character, Integer> mp: en)
        {
            if(mp.getValue()>fst)
            {
                sec = fst;
                fst = mp.getValue();
            }
            else
            {
                if(mp.getValue()>sec && fst != mp.getValue())
                {
                    sec = mp.getValue();
                }
            }

        }

        for(Map.Entry<Character, Integer> mp: en)
        {
            if(mp.getValue() == sec)
            {
                System.out.println("Second Highest char: "+ mp.getKey());
            }

        }

    }
}
