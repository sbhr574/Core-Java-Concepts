package Practice.VS;

import java.util.Arrays;

public class Fid_Longest_Prefix
{
    public static void logic()
    {
        String [] str = {"cluster", "club", "clumsy", "clue", "circle"};

        Arrays.sort(str);

        StringBuilder result = new StringBuilder();

        char[] first = str[0].toCharArray();
        char[] last = str[str.length - 1].toCharArray();

        for(int i=0;i<last.length;i++)
        {
            if(first[i]==last[i])
            {
                result.append(first[i]);
            }
            else
            {
                break;
            }
        }
        System.out.println("Longest prefix is "+result);
    }

    public static void main(String[] args) {
        logic();
    }
}
