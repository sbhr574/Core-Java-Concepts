package Practice;

import java.util.*;

public class DuplicateElements
{
    public static void main(String[] args)
    {
        Set<String> st = new HashSet<>();
        String[] values = {"Jan", "May", "Feb", "May", "July", "Dec", "Jan"};

        //Approach 1
        for(String month : values)
        {
            if(!st.add(month))
            {
                System.out.println(month +" is duplicate");
            }
        }

        approach(values);
    }

    //Approach 2
    public static void approach(String[] values)
    {
        Map<String, Integer> mp = new HashMap<>();

        for(String data : values)
        {
            Integer count = mp.get(data);

            if(count==null)
            {
                mp.put(data, 1);
            }
            else
            {
                mp.put(data, ++count);
            }
        }

        Set<Map.Entry<String, Integer>> en = mp.entrySet();
        for(Map.Entry<String, Integer> data : en)
        {
            if(data.getValue()>1)
            {
                System.out.println(data.getKey());
            }

        }
    }


}
