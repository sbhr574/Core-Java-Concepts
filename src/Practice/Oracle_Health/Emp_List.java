package Practice.Oracle_Health;

import java.util.HashMap;
import java.util.Map;

/**
 * How to matriculate parameters using class constructor
 */
public class Emp_List {

    private static void store() {
        dept_list emp1 = new dept_list(100, "Chad", 50000, "acct");
        dept_list emp2 = new dept_list(190, "Bill", 10000, "mkt");
        dept_list emp3 = new dept_list(170, "Sam", 30000, "acct");
        dept_list emp4 = new dept_list(180, "Alex", 15000, "mkt");
        dept_list emp5 = new dept_list(110, "Ruth", 90000, "eng");

        HashMap<String, String> dept1 = new HashMap<>();
        dept1.put("acct", "accounting");
        dept1.put("mkt", "marketing");
        dept1.put("eng", "engineering");

        HashMap<String, Integer> newDept = new HashMap<>();

        newDept.put(emp1.eng, emp1.acct);
        newDept.put(emp2.eng, emp2.acct);
        newDept.put(emp3.eng, emp3.acct);
        newDept.put(emp4.eng, emp4.acct);
        newDept.put(emp5.eng, emp5.acct);

        Map<String, Integer> result = new HashMap<>();

        for(Map.Entry<String, Integer> mp: newDept.entrySet())
        {
            String old_dept = mp.getKey();
            String new_dept = dept1.get(old_dept);

            if(result.get(new_dept) == null)
            {
                result.put(new_dept, newDept.get(old_dept));
            }
            else
            {
                result.put(new_dept, newDept.get(old_dept) + result.get(new_dept));
            }
        }

        System.out.println(result);

    }

    public static void main(String[] args) {
        store();
    }

}


class dept_list
{

    int id;
    String name;
    int acct;
    String eng;

    dept_list(int id, String name, int acct, String eng)
    {
        this.id = id;
        this.name = name;
        this.acct = acct;
        this.eng = eng;
    }

}
