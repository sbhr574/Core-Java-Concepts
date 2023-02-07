package Practice.FactoryImpl;

public class Android implements Impl
{
    public void click()
    {
        System.out.println("Clicking on Android");
    }

    public boolean click(String name)
    {
        System.out.println("Clicking on Android with string: "+name);
        return true;
    }
}
