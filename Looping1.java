import java.util.*;
public class Looping1 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int totalCoins = 0;
        for(int i = 1; i<=n; i++){
            totalCoins += i * i;



        }
        System.out.println(totalCoins);
        sc.close();

    }
    
    
}
