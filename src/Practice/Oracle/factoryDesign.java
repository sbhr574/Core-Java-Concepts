package Practice.Oracle;

interface implMethods
{
    default void filter(String item)
    {

    }

    default void itemClick(String item)
    {

    }

    void isAvailable();
}

class GetFactoryObject
{
    protected implMethods getObj(String value)
    {
        if(value.equals("home"))
        {
            return new homePage();
        }
        if(value.equals("login"))
        {
            return new loginPage();
        }
        return null;
    }
}

class homePage implements implMethods
{
    @Override
    public void filter(String item) {
        System.out.println("logic for homepage: "+item);
    }

    @Override
    public void isAvailable() {

    }
}

class loginPage implements implMethods
{
    @Override
    public void filter(String item) {
        System.out.println("logic for loginPage: "+item);
    }

    @Override
    public void isAvailable() {

    }
}
public class factoryDesign implements implMethods
{
    private final GetFactoryObject obj;


    public factoryDesign()
    {
        obj = new GetFactoryObject();
    }

    public void filter(String page, String item) {
        implMethods pageObj = obj.getObj(page);
        pageObj.filter(item);
    }

    public static void main(String[] args) {
        factoryDesign en = new factoryDesign();
        en.filter("login", "homepage");
    }

    @Override
    public void isAvailable() {

    }
}
