package Practice;


public class FindOddEven
{
    public static void main(String[] args) {
        int num = 123647840;
        int odd = 0, even = 0;
        StringBuilder oddNum = new StringBuilder();
        StringBuilder evenNum = new StringBuilder();

        while(num!=0)
        {
            int nm = num % 10;
            if(num%2==0)
            {
                even++;
                evenNum.append(nm).append(",");
            }else
            {
                odd++;
                oddNum.append(nm).append(",");
            }
            num = num / 10;
        }
        System.out.println(oddNum +"  "+ evenNum);
        System.out.format("Total Count of odd %s and even %s".formatted(odd, even));
    }
}
