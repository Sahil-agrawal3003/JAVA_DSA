import java.util.*;
public class Looping2 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        int speed = sc.nextInt();

        int speed = 0;
        for(int i = 1; i<=N; i++){
            if(N % i == 0){
                speed += 1;

            }
        }
        System.out.println(speed);
        sc.close();

    }
    
}
