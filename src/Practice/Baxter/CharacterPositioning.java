package Practice.Baxter;

import java.util.Arrays;

public class CharacterPositioning
{
    private static void test()
    {
        int[] hash = new int[26];

        String val = "xxxxtterrebf";

        for(char ch : val.toCharArray()){
            hash[ch - 'a']++;
        }

        int maxIndex = 0;
        int charIndex = 0;
        for(int index=0; index<hash.length; index++){
            if(hash[index]>maxIndex)
            {
                maxIndex = hash[index];
                charIndex = index;
            }
        }

        char ch[] = new char[val.length()];

        int index = 0;
        while(hash[charIndex]-->0){
            ch[index] = (char) (charIndex + 'a');
            index = index +2;
        }

        for(int i=0;i<hash.length; i++) {
            while (hash[i]-- > 0) {
                if (index >= ch.length) index = 1;
                ch[index] = (char) (i + 'a');
                index = index + 2;
            }
        }
            System.out.println(Arrays.toString(ch));
    }

    public static void main(String[] args) {
        test();
    }
}
