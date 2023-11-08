package Practice.Logics;

import java.util.Arrays;

public class Character_Positioning
{
    public static void test()
    {
        String str = "xxxxbbtttrrrrcaaa";

        int[] hash = new int[26];

        for(int i=0;i<str.length();i++)
        {
            hash[str.charAt(i) - 'a']++;
        }
        int max = 0, charIndex = 0;
        for(int i=0;i<hash.length;i++)
        {
            if(max<hash[i])
            {
                max = hash[i];
                charIndex = i;
            }
        }
        char[] result = new char[str.length()];
        int index =  0;
        while (hash[charIndex]-->0)
        {
            System.out.println(hash[charIndex]);
            result[index] = (char) (charIndex + 'a');
            index = index + 2;
        }
        for(int i=0; i<hash.length;i++)
        {
            while (hash[i]-->0)
            {
                if(index >= result.length) index = 1;
                result[index] = (char) (i + 'a');
                index = index + 2;
            }
        }
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        test();
    }
}
