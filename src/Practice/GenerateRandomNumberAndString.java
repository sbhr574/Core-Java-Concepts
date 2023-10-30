package Practice;

//import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class GenerateRandomNumberAndString
{
    public static void main(String[] args)
    {
        //Example 1
        Random random = new Random();
        long num = random.nextLong(1000);
        System.out.println(num);
        double db = random.nextDouble(100);
        System.out.println(db);

        //Example 2: To generate only random decimal number
        System.out.println(Math.random());

        //Example 3: Apache commons-lang API used to generate String. Jar need to import on the project
//        String randomNum = RandomStringUtils.randomNumeric(5).repeat(2);
//        System.out.println(randomNum);
//
//        String randomStr = RandomStringUtils.randomAlphabetic(8).toUpperCase();
//        System.out.println(randomStr);

        //Example 4
        String vl = "C".repeat(10).repeat(12);
        System.out.println(vl);

    }
}
