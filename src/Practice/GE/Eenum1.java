package Practice.GE;

public enum Eenum1
{
    First("");

    private String val;

    Eenum1(String val)
    {
        this.val = val;
    }

    public Eenum1 byCustom(String value)
    {
        Eenum1.First.val = value;
        return Eenum1.First;
    }

    public static void setFirst(String val)
    {
        Eenum1.First.val = val;
    }

    public static String getFirst()
    {
        return First.val;
    }
}
