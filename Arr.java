import java.util.*;


public class Arr {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int []arr = new int[n+1];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();

        }
        int x = sc.nextInt();
        arr[n] = x;
        Arrays.sort(arr);
        for(int i = 0; i<n+1; i++){
            System.out.println(arr[i]+" ");
            
        }

    }
    
}
