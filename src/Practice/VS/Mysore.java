package Practice.VS;

import java.util.Arrays;

public class Mysore
{
    public static void main(String[] args)
    {
        String str = "xxxxpprtyc";
        int[] hash = new int[26];
//        int[] hash1 = new int[26];
//        String str_caps = "XXXXCCJHK";
//        for(int i=0; i<str_caps.length(); i++)
//        {
//            hash1[str_caps.charAt(i) - 'A']++;
//        }
//        System.out.println(Arrays.toString(hash1));

        for(int i=0; i<str.length(); i++)
        {
            hash[str.charAt(i) - 'a']++;
        }
        System.out.println(Arrays.toString(hash));

        int max = 0, letter = 0;
        for(int i=0; i<hash.length; i++)
        {
            if(hash[i]> max)
            {
                max = hash[i];
                letter = i;
            }
        }
        char[] ch = new char[str.length()];
        System.out.println(max +" -- "+letter);
        int index = 0;
        while (hash[letter]-->0)
        {
            System.out.println(letter);
            ch[index] = (char) (letter + 'a');
            index +=2;
        }
        for(int i=0;i<hash.length;i++)
        {
            while (hash[i]-->0)
            {
                if(index >= ch.length) index = 1;
                ch[index] = (char)(i+'a');
                index +=2;
            }
        }
        System.out.println(String.valueOf(ch));
    }

}
