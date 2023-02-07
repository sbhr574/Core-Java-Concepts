package Practice.FactoryImpl;

public interface Impl
{
    default void click()
    {
        System.out.println("not impl");
    }

    default boolean click(String name)
    {
        return false;
    }
}
