package Practice;

public class RevString
{
    public static void main(String[] args)
    {
        String str = "Subhajit";
        int len = str.length();
        String revStr = "";

        for(int i=len-1; i>=0; i--)
        {
            revStr = revStr + str.charAt(i);
        }
        System.out.println(revStr);

        char[] st = str.toCharArray();
        StringBuilder srt = new StringBuilder();
        revStr = "";
        for(int i=len-1; i>=0; i--)
        {
            srt.append(st[i]);
            revStr = revStr + st[i];
        }
        System.out.println(revStr +" "+ srt);
    }
}
