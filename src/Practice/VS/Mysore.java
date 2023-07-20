package Practice.VS;

public class Mysore
{
    public static void main(String[] args) {
//        Travel t = new Travel("df", 120, "", 12, "");
//        System.out.println(t);

        TravelBuilder tr = new TravelBuilder();
        tr.setBus("Volvo");
        tr.setDates(12);
        tr.setDistance(120);
        Travel t = tr.getTravelDetails();
        System.out.println(t);
    }
}
