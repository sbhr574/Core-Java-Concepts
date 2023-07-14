package Practice.GE;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Anagram_Concept
{
    public static void test()
    {
        String val1 = "Story";
        String val2 = "ytoSr";
        val1 = val1.toLowerCase();
        val2 = val2.toLowerCase();
        char []v1 = val1.toCharArray();
        char []v2 = val2.toCharArray();
        Arrays.sort(v1);
        Arrays.sort(v2);
        if(v1 == v2)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
//        test();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();

        // Declare a hashset
        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {

                // Add characters in the hashset.
                int put = (int) s.charAt(i);
                h.add(put);
            }
        }
        if (h.size() == 26)
            System.out.println("pangram");
        else
            System.out.println("not pangram");
    }
}
