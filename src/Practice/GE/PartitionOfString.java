package Practice.GE;

public class PartitionOfString
{
    public static void test()
    {
        String str = "ababcbbaedfrtfdreljkiykji";
        for (int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            int lastIndex = str.lastIndexOf(ch);
            int j = lastIndex;
            while (j>i)
            {
                j--;
                int last = str.lastIndexOf(str.charAt(j));
                if(last>lastIndex)
                {
                    lastIndex = last;
                }
            }
            i=lastIndex;
            System.out.println(str.substring(j, lastIndex+1));
        }
    }

    public static void main(String[] args) {
        test();
    }
}
