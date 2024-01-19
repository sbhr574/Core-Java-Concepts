package Array_Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * emp_list =
 * [
 *     [100, “Chad”, 50000,”acct”],
 *     [190, “Bill”, 10000,”mkt”],
 *     [170,”Sam”, 30000,”acct”],
 *     [180,”Alex”, 15000,”mkt”],
 *     [110,”Ruth”, 90000,”eng”]
 * ]
 *
 *
 * dept_list =
 * [
 *     [“acct”,”accounting”],
 *     [“mkt”,”marketing”],
 *     [“eng”,”engineering”]
 * ]
 *
 * Output=
 * [
 *   [ “accounting”, 80000 ],
 *   [ “marketing”, 25000 ],
 *   [ “engineering”, 90000 ]
 * ]
 */
class Emp
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
public class INV_QA
{
    public static void test1()
    {

        Emp emp1 = new Emp(100, "Chad", 50000,"acct");
        Emp emp2 = new Emp(190, "Bill", 10000,"mkt");
        Emp emp3 = new Emp(170,"Sam", 30000, "acct");
        Emp emp4 = new Emp(180, "Alex", 15000, "mkt");
        Emp emp5 = new Emp(110,"Ruth", 90000, "eng");

        HashMap<String, String> dept1 = new HashMap<>();
        dept1.put("acct", "accounting");
        dept1.put("mkt", "marketing");
        dept1.put("eng", "engineering");

        HashMap<Integer, String> mp = new HashMap<>();
        mp.put(emp1.sal, emp1.dept);
        mp.put(emp2.sal, emp2.dept);
        mp.put(emp3.sal, emp3.dept);
        mp.put(emp4.sal, emp4.dept);
        mp.put(emp5.sal, emp5.dept);

        Set<Map.Entry<Integer, String>> en = mp.entrySet();
        HashMap<String, Integer> result = new HashMap<>();

        for(Map.Entry val: en)
        {
            String dep = (String) val.getValue();
            String dept11 = dept1.get(val.getValue());
            if(result.get(dep)==null)
            {
                result.put(dept11, (Integer) val.getKey());
            }
            else
            {
                Integer salary = result.get(dept11);
                result.put(dept11, (Integer) val.getKey() + salary);
            }
        }

        System.out.println(result);

    }

    public static void main(String[] args) {
        test1();
    }

}
