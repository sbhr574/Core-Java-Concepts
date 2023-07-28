package String_Manipulation;

public class StringBuffer_Concept {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Anand");
        System.out.println(sb.charAt(2));
        System.out.println(sb.delete(1, 2));
    }
}
