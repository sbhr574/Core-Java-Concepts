package Practice.ThermoFisher;

import java.util.HashMap;
import java.util.Map;

public class TwoSum
{
    public static void main(String[] args) {
        int ar[] = {12, 14, 18, 45, 8, 23};

        Map<Integer, Integer> mp = new HashMap();
        int target = 20;

        int index = 0;
        for(int num : ar)
        {
            int val = 20 - num;
            val = Math.abs(val);
            if(mp.containsKey(val))
            {
                System.out.println(mp.get(val)+", "+ index);
                break;
            }
            mp.put(num, index);
            index++;
        }
    }
}
