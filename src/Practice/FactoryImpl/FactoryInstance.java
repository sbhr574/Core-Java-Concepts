package Practice.FactoryImpl;

public class FactoryInstance
{
    protected Impl getInstance(String name)
    {
        if(name.equals("Windows"))
        {
            return new Windows();
        }
        else if (name.equals("Android"))
        {
            return new Android();
        }

        return null;
    }
}
