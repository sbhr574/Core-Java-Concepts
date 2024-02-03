package Practice.ThermoFisher;

import java.util.*;

public class mapPrac
{
    public static void main(String[] args) {

        int ar[] = {12, 14, 13, 12, 15, 14, 13};

        Map<Integer, Integer> mp = new HashMap<>();
        for(int num : ar)
        {
            if(mp.get(num) == null)
            {
                mp.put(num, 1);
            }
            else
            {
                mp.put(num, mp.get(num)+1);
            }
        }

        System.out.println(mp);

        Set<Map.Entry<Integer, Integer>> vals = mp.entrySet();
        for(Map.Entry<Integer, Integer> val :  vals)
        {
            if(val.getValue()<2)
            {
                System.out.println(val.getKey());
            }
        }
    }
}
