package Practice.GE;

import java.util.HashSet;
import java.util.Set;

public class Find_CommonSubString
{
    public static void test()
    {
        String str1 = "aacbdsnd";
        String str2 = "ndjszacaa";

        Set<Character> ch1 = new HashSet<>();
        Set<Character> ch2 = new HashSet<>();

        for(Character ch: str1.toCharArray())
        {
            ch1.add(ch);
        }

        for(Character ch: str2.toCharArray())
        {
            ch2.add(ch);
        }
        ch2.retainAll(ch1);
        System.out.println(ch2.isEmpty());
        System.out.println(ch2);
    }

    public static void main(String[] args) {
//        test();
//        Eenum1.setFirst("Roy");
        System.out.println(Eenum1.getFirst());
    }
}
