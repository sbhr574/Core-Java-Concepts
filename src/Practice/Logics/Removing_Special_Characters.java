package Practice.Logics;

public class Removing_Special_Characters
{
    public static void main(String[] args) {
        String val = "A man,$^*** a plan,(*))& a canal: Panama";
        val = val.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(val);
    }
}
