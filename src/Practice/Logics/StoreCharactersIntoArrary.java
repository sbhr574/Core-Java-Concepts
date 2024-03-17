package Practice.Logics;

import java.util.Arrays;

public class StoreCharactersIntoArrary
{
    public static void main(String[] args) {
        String str = "xxsShdDggBbsJdm";

        int []hash = new int[26];

        for(int i=0; i<str.length(); i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
            {
                hash[str.charAt(i) - 'A']++;
            }
            else
            {
                hash[str.charAt(i) - 'a']++;
            }
        }
        System.out.println(Arrays.toString(hash));
        StringBuilder st= new StringBuilder();

        for(int i=0;i<hash.length; i++)
        {
            while (hash[i]-->0)
            {

                char ch =  (char) (i + 'a');
                st.append(ch);
            }
        }
        System.out.println(st);
    }
}
