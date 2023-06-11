package Practice.VS;

import java.util.*;

public class Find_Distinct_Num
{
    public static void test1(int ar[])
    {
        Map mp = new HashMap();
        for(int i=0;i<ar.length;i++)
        {
            Integer count = (Integer) mp.get(ar[i]);
            if(count==null)
            {
                mp.put(ar[i], 1);
            }
            else
            {
                mp.put(ar[i], ++count);
            }
        }

        Set<Map.Entry<Integer, Integer>> dn = mp.entrySet();
        for (Map.Entry<Integer, Integer> en:dn)
        {
            if(en.getValue() < 2)
            {
                System.out.println(en.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Integer ar[] = {7,6,10,5,9,2,1,15,7, 15, 5, 10};
        String str[] = { "Apple", "Banana" };
        List<String> l = Arrays.asList(str);
        List<Integer> lst = new ArrayList<>(Arrays.asList(ar));
        List<Integer> nn = Arrays.asList(ar);
        lst.remove(0);
        System.out.println(lst);
//        test1(ar);

    }
}
