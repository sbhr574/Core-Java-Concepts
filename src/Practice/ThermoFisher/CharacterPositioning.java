package Practice.ThermoFisher;

import java.util.Arrays;

public class CharacterPositioning
{
    public static void main(String[] args) {
        String s = "aahdhsaananda";
        int data[] = new int[26];
        for(int i=0; i<s.length(); i++)
        {
            data[s.charAt(i) - 'a']++;
        }

        //Find highest character from data array
        int h = Integer.MIN_VALUE;
        int charIndex = 0;

        for(int i=0; i<data.length; i++)
        {
            if(h<data[i])
            {
                h = data[i];
                charIndex = i;
            }
        }

        char result[] = new char[s.length()];
        int poisition = 0;

        while(data[charIndex]-->0)
        {
            result[poisition] = (char) (charIndex + 'a');
            poisition = poisition + 2;
        }

        System.out.println(Arrays.toString(result));
    }
}
