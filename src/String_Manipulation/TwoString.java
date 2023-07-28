package String_Manipulation;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Find two string has substring
 */
public class TwoString
{
    public static void main(String[] args)
    {
        String str1 = "barbell";
//        String str2 = "wtyuop";
        String str2 = "barbell";
        HashSet s1 = getSetDetails(str1);
        HashSet s2 = getSetDetails(str2);

//        boolean se = s1.stream().anyMatch(s2::contains);
        s1.retainAll(s2);
        System.out.println(s1);
        if(!s1.isEmpty())
            System.out.println("yes");
        else
            System.out.println("No");

    }

    private static HashSet getSetDetails(String val)
    {
        HashSet s1 = new HashSet();
        char[] at = val.toCharArray();
        for(char as : at)
        {
            s1.add(as);
        }
        return s1;
    }
}
