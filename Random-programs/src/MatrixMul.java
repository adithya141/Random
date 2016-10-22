/**
 * Created by Owner on 10/21/2016.
 */

import java.util.Arrays;


public class MatrixMul {
    public static void main(String[] args) {
        int[][] ary1 = {{1,0,0,3},
                {0,1,0,0},
                {0,0,1,4},
                {0,0,0,1}};
        int[][] ary2 = {{1,0,2,0},
                {0,1,0,0},
                {0,5,1,0},
                {0,0,0,1}};
        int[][] product = new int[4][4];

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){

                product[i][j] = ary1[i][0]*ary2[0][j]+ary1[i][1]*ary2[1][j]+ary1[i][2]*ary2[2][j]+ary1[i][3]*ary2[3][j];

            }
        }

        System.out.println(Arrays.deepToString(product));

        for(int k=0; k<4; k++){
            for (int l=0; l<4;l++){
                System.out.printf("%4d", product[k][l]);
            }
            System.out.println();
        }


    }
}
