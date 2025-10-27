import java.util.*;
public class fibonacci{
public static int calcSum (int n) {

    if (n == 1){
        return 1;

    }
   int Snm1 = calcSum(n - 1);
   int Sn = n + Snm1;
   return Sn;

    
}

public static int fib(int n){
    if(n == 0 || n == 1){
        return n;
    }
     int fnm1 = fib(n -1);
     int fnm2 = fib(n - 2);
     int fn = fnm1 + fnm2;
     return fn;

}

public static void main(String args[]){
    int n = 26;
  //  System.out.println(fib(n));
  System.out.println(fib(23));
  System.out.println(fib(24));
  System.out.println(fib(25));
  System.out.println(fib(26));
  System.out.println(fib(27));
  System.out.println(fib(28));
  System.out.println(fib(29));
  System.out.println(fib(30));
  

}

}
