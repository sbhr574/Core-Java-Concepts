package Practice.FactoryImpl;

public class TControl implements IControls
{

    private final FactoryInstance factoryInstance;
    TControl()
    {
        this.factoryInstance = new FactoryInstance();
    }

    @Override
    public void click()
    {
        System.out.println("not impl click");
    }

    @Override
    public String sendItem()
    {
        System.out.println("not impl sendItem");
        return null;
    }

    @Override
    public void getItem()
    {
        System.out.println("not impl getItem");
    }
}
