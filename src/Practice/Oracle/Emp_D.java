package Practice.Oracle;

class Emp_Data
{
    String empN;
    String empAdd;
    int eSal;
    Emp_Data(String empName, String empAddress, int empSal)
    {
        this.empN = empName;
        this.empAdd = empAddress;
        this.eSal = empSal;
    }


}
public class Emp_D
{
    public static void main(String[] args)
    {
        Emp_Data er1 = new Emp_Data("Suvo1", "Bangalore", 100000);
        Emp_Data er2 = new Emp_Data("Suvo2", "Kolkata", 200000);
        Emp_Data er3 = new Emp_Data("Suvo3", "Pune", 200000);
        Emp_Data er4 = new Emp_Data("Suvo4", "Kolkata", 200000);
        Emp_Data er5 = new Emp_Data("Suvo5", "Chennai", 200000);

        // TODO: 18-08-2023 rest is not impl to get total sal who lives in kolkata

    }
}
