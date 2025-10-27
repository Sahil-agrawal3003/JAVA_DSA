import java.util.*;

public class Uppertriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int square[][] = new int[n][n];

        for(int i =0; i<n; i++){
            for(int j = 0; j<n; j++){
                square[i][j] = sc.nextInt();

            }
        }

        boolean isUpperTriangle = true;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<i;j++){
                if(square[i][j] != 0){
                    isUpperTriangle = false;
                    break;

                }
            }
        }

        if(isUpperTriangle == true){
            System.out.println("Upper Triangle Matrix");

        }else{
            System.out.println("Not an Upper Triangle Matrix");

        }

        sc.close();

    }
    
}
