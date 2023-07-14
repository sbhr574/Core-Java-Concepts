package Practice.Saviynt;

import java.nio.charset.Charset;
import java.util.*;

public class Prac4
{

    private static HashMap<Integer, Integer> elements = new HashMap<Integer,
            Integer>();

    public static void getNum(int ar[])
    {
        int count = 0;
        for(int index=0;index<ar.length;index++) {
            if (elements.containsKey(ar[index])) {
                elements.put(ar[index], elements.get(ar[index]) + 1);
            } else {
                elements.put(ar[index], 1);
            }
        }
        System.out.println(elements.get(4));
    }

    public static void triplet(int ar[], int sum)
    {
        int f = ar[0];
        for(int i=1;i<ar.length;i++)
        {
            int s = ar[1];
            for(int j=2;j<ar.length;j++)
            if((f+s+ar[i])==sum)
            {

            }
        }
    }

    public static ArrayList<ArrayList<Integer>> threeSum(int[] num)
    {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (num.length < 3)
            return result;
// sort array
        Arrays.sort(num);
        for (int i = 0; i < num.length - 2; i++)
        {
// //avoid duplicate solutions
            if (i == 0 || num[i] > num[i - 1])
            {
                int negate = -num[i];
                int start = i + 1;
                int end = num.length - 1;
                while (start < end) {
//case 1
                    if (num[start] + num[end] == negate) {
                        ArrayList<Integer> temp = new ArrayList<Integer>();
                        temp.add(num[i]);
                        temp.add(num[start]);
                        temp.add(num[end]);
                        result.add(temp);
                        start++;
                        end--;
//avoid duplicate solutions
                        while (start < end && num[end] == num[end + 1])
                            end--;
                        while (start < end && num[start] == num[start - 1])
                            start++;
//case 2
                    } else if (num[start] + num[end] < negate) {
                        start++;
//case 3
                    } else {
                        end--;
                    }
                }
            }
        }
        return result;
    }

    public static void removeDuplicate()
    {
        String[] values = {"Jan", "May", "Feb", "May", "July", "Dec", "Jan"};
//        List<String> st = new ArrayList<>();
//        for(String val : values)
//        {
//            if(st.stream().noneMatch(val::equals))
//            {
//                st.add(val);
//            }
//        }
//        System.out.println(st);

    }

    public static void printMap()
    {
        Map<String, Integer> mp = new HashMap<>();
        mp.put("s", 1);
        mp.put("k", 0);
        mp.put("d", 0);
        mp.put("t", 3);
        mp.put("w", 3);
        mp.put(null, 3);
        Set<Map.Entry<String, Integer>> en = mp.entrySet();
        for(Map.Entry<String, Integer> data : en)
        {
            if(data.getValue()>0)
            {
                System.out.println(data.getKey());
            }
        }
    }

    public static void main(String[] args) {

//        int ar[] =  {-1, 0, 1, 2, -1, -4};
//        System.out.println(threeSum(ar));

        printMap();
    }
}
