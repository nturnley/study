package Chapter1;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem1_8 {

    /*
    Zero Matrix:
    Write an algorithm such that if an element in an MxN matrix is 0,
    it's entire row and column are set to 0.
    */


    @Test
    public void problem() throws Exception {

        int[][] input = new int[][]
                {{1,  2,  3,  4},
                 {5,  6,  7,  8},
                 {3,  0,  2,  5},
                 {2,  9,  8,  5},
                 {2,  9,  8,  0}
                };

        Set<Integer> columnSet = new HashSet<>();
        Set<Integer> rowSet = new HashSet<>();

        for(int i=0; i<input.length;i++){
            for(int j=0; j<input[0].length;j++){
                if (input[i][j] == 0){
                    rowSet.add(i);
                    columnSet.add(j);
                }
            }
        }

        for (Integer i : columnSet) {
            for (int j=0; j<(input.length); j++) {
                input[j][i] = 0;
            }

        }

        for (Integer i : rowSet) {
            for (int j=0; j<(input[0].length); j++) {
                input[i][j] = 0;
            }

        }

        for (int[] anInput : input) {
            System.out.println(Arrays.toString(anInput));
        }



    }


}
