import java.util.*;

public class Pairingproblem {
    public static int friendspairing(int n){
        //base case:--
        if((n == 1) || (n == 2)){
            return n;

        }
      /* 
       //single
       int fnm1 = friendspairing(n - 1);

         //pair:--
    int fnm2 = friendspairing(n - 2);
    int pairWays = (n - 1) * fnm2;

    //totWays:--
    int totWays = fnm1 + pairWays;
    return totWays; 


    

    

    }

    */
    //Short way:--
    return friendspairing(n - 1) + (n - 1) * friendspairing(n - 2);
    }
    public static void main(String args[]){
        System.out.println(friendspairing(3));

    }

    

    
}


