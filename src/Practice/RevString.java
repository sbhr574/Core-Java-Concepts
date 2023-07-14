package Practice;

public class RevString
{
    public static void Test1()
    {
        String val = "This is my house";
        String ar[] = val.split(" ");
        for(int i=0;i<ar.length;i++)
        {
            String str = ar[i];
            for(int j=str.length()-1;j>=0;j--)
            {
                System.out.print(str.charAt(j));
            }

            System.out.print(" ");
        }
    }
    public static void main(String[] args)
    {
        String str = "Subhajit";
        int len = str.length();
        String revStr = "";

        for(int i=len-1; i>=0; i--)
        {
            revStr = revStr + str.charAt(i);
        }
//        System.out.println(revStr);

        char[] st = str.toCharArray();
        revStr = "";
        for(int i=len-1; i>=0; i--)
        {
            revStr = revStr + st[i];
        }
//        System.out.println(revStr);

        Test1();
    }


}
