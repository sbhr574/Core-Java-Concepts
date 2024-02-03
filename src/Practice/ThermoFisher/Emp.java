package Practice.ThermoFisher;

import java.util.*;

public class Emp
{
    int id;
    String val;
    int sal;
    String dept;
    Emp(int id, String val, int sal, String dept)
    {
        this.id = id;
        this.val = val;
        this.sal = sal;
        this.dept = dept;
    }
}

class DEPT
{
    String dept1;
    String dept2;

    DEPT(String dept1, String dept2)
    {
        this.dept1 = dept1;
        this.dept2 = dept2;
    }
}

class list
{
    public static void dd()
    {
        Emp emp1 = new Emp(123, "100000", 100, "acct");
        Emp emp2 = new Emp(124, "100000", 200, "mkt");
        Emp emp3 = new Emp(125, "100000", 300, "acct");
        Emp emp4 = new Emp(126, "100000", 500, "sel");

        DEPT dept1 = new DEPT("acct", "accounting");
        DEPT dept2 = new DEPT("mkt", "marketing");
        DEPT dept3 = new DEPT("sel", "sell");

        List<Emp> obj = new ArrayList<>();
        obj.add(emp1);
        obj.add(emp2);
        obj.add(emp3);
        obj.add(emp4);

        List<DEPT> obj1 = new ArrayList<>();
        obj1.add(dept1);
        obj1.add(dept2);
        obj1.add(dept3);

        HashMap<String, Integer> result = new HashMap<>();
        for(Emp em: obj)
        {
            String dp2 = em.dept;
            DEPT op = obj1.stream().filter(x->x.dept1.equals(dp2)).findFirst().orElse(null);

            result.merge(op.dept2, em.sal, Integer::sum);

//            if(result.get(op.dept2) == null)
//            {
//                result.put(op.dept2, em.sal);
//            }
//            else
//            {
//                result.put(op.dept2, result.get(op.dept2)+ em.sal);
//            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        dd();
    }
}