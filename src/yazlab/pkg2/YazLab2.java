/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yazlab.pkg2;

/**
 *
 * @author ffeki
 */
public class YazLab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matris[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {1, 2, 3}};
        //System.out.println(matris.length + " - " + matris[0].length);
        int[][] returnMatris = Transpose(matris);
        for (int i = 0; i < matris[0].length; i++) {
            for (int j = 0; j < matris.length; j++) {
                System.out.print(returnMatris[i][j]+" ");

            }
            System.out.println("");

        }

         Multiplication(matris, returnMatris);
        
//        for (int i = 0; i < returnMultip.length; i++) {
//            for (int j = 0; j < returnMultip.length; j++) {
//                System.out.print(returnMultip[i][j]+" ");
//                
//            }
//            System.out.println();
//            
//        }
        
    }

//    static int[][] Multiplication(int[][] m, int[][] m2) {
//        int matrix[][] = new int[m[0].length][m2.length];
//        System.out.println(m[0].length +" - "+m2.length);
//        for (int i = 0; i < matrix.length; i++) {
//
//            for (int j = 0; j < matrix.length; j++) {
//                int multip = 0;
//                for (int k = 0; k < matrix.length; k++) {
//                    multip += m[i][k] * m2[k][j];
//
//                }
//                matrix[i][j] = multip;
//            }
//
//        }
//
//        return matrix;
//    }
    
    static int[][] Multiplication(int [][]m, int [][]m2){
        int [][]matris = new int[m.length][m2[0].length];
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                int tmp = 0;
                for (int k = 0; k < m[0].length; k++) {
                    tmp += m[i][k] * m2[k][j];
                    
                }
                matris[i][j] = tmp;               
                System.out.print(matris[i][j]+" ");
            }
            System.out.println("");
            
        }
        
        
        return matris;
    }

    static int[][] Transpose(int[][] matris) {
        int[][] newMatris = new int[matris[0].length][matris.length];
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                newMatris[j][i] = matris[i][j];
                //System.out.println(matris[i][j]);

            }
            //System.out.println("");

        }

//        for (int i = 0; i < matris[0].length; i++) {
//            for (int j = 0; j < matris.length; j++) {
//                System.out.println(newMatris[i][j]);
//                
//            }
//            
//        }
        return newMatris;

    }

}
