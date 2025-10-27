import java.util.*;
public class Looping4 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    String number = Integer.toString(n);
    if(k>number.length()){
      System.out.println(-1);
    }else{
      char digit = number.charAt(k-1);
      System.out.println(digit);
    }
  } 
}

