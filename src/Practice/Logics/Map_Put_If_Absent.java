package Practice.Logics;

import java.util.HashMap;

public class Map_Put_If_Absent
{
    /**
     * PutIfAbsent: If the specified key is not already associated with a value (or is mapped to null)
     * associates it with the given value and returns null, else returns the current value.
     */

    public static void main(String[] args) {
        var hashmap = new HashMap<Integer, Integer>();
        hashmap.put(1, 23);
        hashmap.put(2, 34);
        hashmap.put(3, 45);

        hashmap.put(2, 33);
        System.out.println(hashmap.get(2));

        hashmap.putIfAbsent(2, 44); //Expected to store 33 not 44
        System.out.println(hashmap.get(2));


    }
}
