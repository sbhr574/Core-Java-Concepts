package Practice;

import java.util.*;
import java.util.stream.Collectors;

class D
{
    SAP sap;

    public D(SAP sap)
    {
        this.sap = sap;
    }
    void a()
    {
        System.out.println("from a");
    }
}

class E
{
    SAP sap;

    public E(SAP sap)
    {
        this.sap = sap;
    }
//    D e()
//    {
//        System.out.println("from e");
//        return new D();
//    }
}

public class SAP
{
    public final D dd = new D(this);
    void b()
    {
        System.out.println("from b");
    }
    public static void reverseMethod(int number) {
        if (number < 10) {
            System.out.println(number);
            return;
        } else {
            System.out.print(number % 10);
            reverseMethod(number / 10);
        }
    }
    public static void main(String[] args)
    {
        D s = new D(new SAP());


        s.sap.dd.a();


        int a[] = {0, 1, 2, 3, 4, 5};
        int ja = 12345;
        int num = 0;
//        while (j!=0)
//        {
//            num = num*10 + j % 10;
//            j = j / 10;
//        }
//        System.out.println(num);
//        reverseMethod(j);

        List<String> er = new ArrayList<>();
        er.add("A");
        er.add("B");
        er.add("B");
        er.add("D");

        List<String> ew = er.stream().filter(x->x.equals("B")).toList();
//        System.out.println(er.get(3));
//        ew.add("SS");
//        System.out.println(a[5]);
        new SAP().b();

//        int ar[] = {4, 1, 5,7,8,2};
        int ar[] = {9,7,1,2,4,67,21,4,54,11};
        for(int i=0;i<ar.length;i++){
            for (int j=i+1;j<ar.length;j++){
                if(ar[i]>ar[j])
                {
                    int k = ar[i];
                    ar[i] = ar[j];
                    ar[j] = k;
//                    i++;
                }
            }
        }
        System.out.println(Arrays.toString(ar));

        String[] values = {"Jan", "May", "Feb", "May", "July", "Dec", "Jan"};

        Set<String> st = new HashSet<>();
        Map<String, Integer> mp = new HashMap<>();

        for(String val :  values)
        {
            Integer count = mp.get(val);
            if(count == null)
            {
                mp.put(val, 1);
            }
            else
            {
                mp.put(val, ++count);
            }
        }
        System.out.println(mp);

//        int num1 = 1;
//        Scanner sc = new Scanner(System.in);
//
//        int f = sc.nextInt();
//        while (f != 0)
//        {
//            num1 = num1 * f;
//            f = f - 1;
//        }
//        System.out.println(num1);

        int[] arr = {1, 2, 2, 6, 7, 9, 9, 5, 2, 7,7, 7};
        List<Integer> lt = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(i == arr.length -1) {
                lt.add(arr[i]);
                break;
            }
            if(arr[i]!=arr[i+1]){
                lt.add(arr[i]);
            }
            else
            {
                i++;
            }
        }
        System.out.println(lt);
    }
}
