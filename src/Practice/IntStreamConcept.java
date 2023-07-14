package Practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamConcept
{

    public static void main(String[] args) {
        int [] myIntArray1 = IntStream.range(0, 100).toArray(); // From 0 to 99
        int [] myIntArray2 = IntStream.rangeClosed(0, 100).toArray(); // From 0 to 100
        int [] myIntArray3 = IntStream.of(12,25,36,85,28,96,47).toArray(); // The order is preserved.
        int [] myIntArray4 = IntStream.of(12,25,36,85,28,96,47).sorted().toArray(); // Sort

        System.out.println(Arrays.toString(myIntArray1));
        System.out.println(Arrays.toString(myIntArray2));
        System.out.println(Arrays.toString(myIntArray3));
        System.out.println(Arrays.toString(myIntArray4));
    }
}
