import java.util.*;
public class Rotationstring {
    public static  int isCyclicRotations(String P, String Q){
        if(P.length() != Q.length()){
            return 0;

        }
         String doubled = P + P;
         if(doubled.contains(Q)){
            return 1;

         }else{
            return 0;

         }


    }

    public static void main(String args[]){
        
    }

    
}
