package Practice.Baxter;

public class StringNG
{
    public static void main(String[] args) {
        String str = "aabbccdebbd";
        int count = 0;
        StringBuilder st = new StringBuilder();
        for(int i=0;i<str.length(); i++){
            count++;
            if((i+1)>= str.length() || str.charAt(i) != str.charAt(i+1)){
                st.append(str.charAt(i));
                st.append(count);
                count = 0;
            }

        }
        System.out.println(st);
    }
}
