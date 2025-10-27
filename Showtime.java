import java.util.*;

public class Showtime {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int age = sc.nextInt();
        String showTime = sc.next();
        double price;

        if("13.30".equals(showTime)) {
            price = 2.00;

        } else if(age > 13){
            price  = 5.00;

        } else{
            price = 2.00;
        }
        System.out.println("$%.2f\n",price);
        sc.close();
        
    }
    
}
