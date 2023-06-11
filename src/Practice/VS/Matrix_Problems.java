package Practice.VS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Matrix_Problems
{
    public static void problem1()
    {
        // declare & initialize 2D arrays for int
        int[][]matrix1 = {{2, 13}, {44, 5}};
        int[][]matrix2 = {{10, 12}, {24, 50}};

        for(int row=0;row<2;row++)
        {
            for(int col=0;col<2;col++)
            {
                System.out.print(matrix1[row][col] + matrix2[row][col] +" ");
            }
            System.out.println();
        }
    }

    public static void problem2()
    {
        int[][] matrix = new int[][]{{2, 3}, {4, 5}};

        for(int[] r : matrix)
        {
            System.out.println(Arrays.toString(r));
        }
    }

    public static void main(String[] args)
    {
        problem1();





    }

}
