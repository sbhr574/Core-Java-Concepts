package Practice.Publics_Sepient;

import java.util.*;

public class Sample1
{

    // Returns index of x if it is present in arr[],
    // else return -1
    static int binarySearch(String[] arr, String x)
    {
        int l = 0, r = arr.length - 1;

        // Loop to implement Binary Search
        while (l <= r) {

            // Calculatiing mid
            int m = l + (r - l) / 2;

            int res = x.compareTo(arr[m]);

            // Check if x is present at mid
            if (res == 0)
                return m;

            // If x greater, ignore left half
            if (res > 0)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        return -1;
    }
    public static void main(String[] args)
    {
        long startTime = System.currentTimeMillis();

        String[] arr
                = { "contribute","Self organized","oh", "A", "B", "X", "ok", "OK", "I am best doctor", "geeks", "ide", "practice", "Subhajit", "way", "T", "I am good", "Love You", "OH" };
//        Arrays.sort(arr);
//        String x = "ok";
//        int result = binarySearch(arr, x);
//
//        if (result == -1)
//            System.out.println("Element not present");
//        else
//            System.out.println("Element found at "
//                    + "index " + result);
        String[] arr1
                = { "contribute","Self organized"};
        System.out.println(Arrays.binarySearch(arr1, "contribute"));
//        System.out.println(Arrays.stream(arr).anyMatch("ok"::equals));
        long endTime = System.currentTimeMillis();

        System.out.println("That took " + (endTime - startTime) + " milliseconds");

        HashMap<String, Integer> mp = new HashMap<>();
        for(String ar : arr)
        {
            Integer count = mp.get(ar);
            if(count == null)
            {
                mp.put(ar, 1);
            }
            else
            {
                mp.put(ar, count+1);
            }
        }
        //Way 1
        Set<Map.Entry<String, Integer>> result = mp.entrySet();
//        for (Map.Entry<String, Integer> t: result)
//        {
//            System.out.println(t.getKey() +"-"+ t.getValue());
//        }

        //Way 2
        Iterator<Map.Entry<String, Integer>> it = mp.entrySet().iterator();
        while (it.hasNext())
        {
            Map.Entry<String, Integer> t = it.next();
            System.out.println(t.getKey() +"-"+ t.getValue());
        }

        //Way 3
        for (Map.Entry<String, Integer> t : mp.entrySet()) {
            System.out.println(t.getKey() + "-" + t.getValue());
        }

    }
}
