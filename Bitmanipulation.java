import java.util.*;



public class Bitmanipulation {
  public static void oddOrEven(int n) {
    int bitmask = 1;
    if((n & bitmask) == 0){
      // even numbers 
      System.out.println("even number");

    }else{
      System.out.println("odd number");

    }
  }

  public static int getIthBit (int n, int i){
    int bitMask = 1<<i;
    if((n & bitMask) == 0){
      return 0;
    }else{
      return 1;
    }
  }
    public static int clearIthBit(int n , int i){
      int bitMask = ~(1<<i);
      return n & bitMask;
    }
      //updateIthbit 
    public static int updateIthBit(int n, int i, int newBit){
      
      /*if(newBit == 0){
        return clearIthBit(n , i);

      }else{
        return setIthBit(n , i);
      } */

      n = clearIthBit(n , i);
      int BitMask = newBit<<i;
      return n | BitMask;
    }

    //isPowerofTwo
    public static boolean isPowerofTwo(int n){
      return (n &(n - 1)) == 0;

    }

    //countsetbits
    public static int countSetBits(int n){
      int count = 0;
      while(n > 0){
        if((n & 1) != 0){
          count ++;
        }
       n = n>>1;
      }
      return count;
    }
    

  public static void main(String args[]){
    //System.out.println((5^6));
    
   // oddOrEven(3);
   // oddOrEven(14);
  // System.out.println(getIthBit(10, 2));
   // System.out.println(clearIthBit(10, 1));
  // System.out.println(updateIthBit(10, 2 ,1));
  // System.out.println( isPowerofTwo(8));
   System.out.println(countSetBits (10));

  }  
}   

