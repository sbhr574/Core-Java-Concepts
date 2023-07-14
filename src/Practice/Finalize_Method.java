package Practice;

import java.util.Arrays;

public class Finalize_Method {

    public static void main(String[] args)
    {
        String val = "SubhajitRoyu";
        StringBuilder df = new StringBuilder(val);
        System.out.println(val.lastIndexOf("u"));

    }
    @Override
    protected void finalize()
    {
        System.out.println("finalize method called ");
    }

    public void test() throws Exception
    {
//        try
//        {
//            System.out.println("test");
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
    }
}
