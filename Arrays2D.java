import java.util.*;
public class Arrays2D {
    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        int n = matrix.length,m = matrix[0].length;

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter elements of 3x3 matrix:");
        for(int i = 0; i<n;i++){
            for(int j =0; j<m; j++){
                matrix[i][j] = sc.nextInt();

            }
        }

        //output
        System.out.println("Matrix is:");
        for(int i =0; i<n; i++){
            for(int j =0 ; j<m ; j++ ) {
           
               System.out.print(matrix[i][j]+" ");










            }

            System.out.println();
        }
               
        sc.close();
        

    }

    
}
