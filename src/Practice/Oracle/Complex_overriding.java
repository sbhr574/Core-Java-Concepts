package Practice.Oracle;

class vd
{
    public void test1()
    {
        System.out.println("from vd test1");
    }
}
public class Complex_overriding extends vd
{
    public void test1()
    {
        System.out.println("from Complex_overriding test1");
    }
    public static void main(String[] args)
    {
        vd v = new Complex_overriding();
        vd s = new vd();
//        Complex_overriding com = new Complex_overriding();
        s.test1();
        v.test1();
    }
}
