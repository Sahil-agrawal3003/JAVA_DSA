import java.util.*;
public class DailyProfit {
    public  static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int inv = sc.nextInt();
        int earn = sc.nextInt();
        if(inv >= 0 &&  earn >= 0){
            if (inv < earn){
                int profit = earn - inv;
                int change = (profit * 100)/ inv;
                System.out.println("Profit - " + change + "%");

            } else if (inv > earn){
                int profit = inv - earn;
                int change = (loss * 100 ) / inv;
                  System.out.println("Loss - " + change + "%");

            }else{
                System.out.println("No profit No Loss");

            } 

            } else{ 
                System.out.println("Invalid Input");


            }
        }
    }

    

