/*public class RecursionBasics {
    public static void printDec(int n){

       if (n == 1){
        System.out.println(n);
        return;
       } 

       System.out.print(n+" ");
       printDec(n - 1); 


    } */

   /* public static void main (String args[]){ 
        int n = 10;
        printDec(n);
    } */
    

  

public class RecursionBasics { 
    public static void printDec(int n){

      // if (n == 1){
       // System.out.println(n);
      // return;
    //  } 

       System.out.print(n+" ");
       printDec(n - 1);


       


    }


    public static void printInc(int n){
        if (n == 1){
            System.out.print(n+" ");
            return;
        }

        printInc(n - 1);
        System.out.print(n+" ");
    }

    public static boolean isSorted(int arr[], int i){
        if(i == arr.length - 1){
           return true;

        }

        if(arr[i] > arr[i+1]){ 
            return false; 
        }

        return isSorted(arr, i+1); 

    }

    public static int firstOccurence (int arr[], int key, int i){
        if (i == arr.length){
        return -1;

        }
        if(arr[i] == key){
            return i;
        }

        return firstOccurence(arr, key, i+1);

    }  

    public static int  lastOccurence(int arr[], int key, int i){
        if (i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr,key, i+1);
        if (isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }


    public class Power{
        public static int optimizedPower(int a, int n){
            if(n == 0){
                return 1;

            }
            int halfPower = optimizedPower(a,n/2);
            int halfPowerSq = halfPower * halfPower;

            //odd
            if(n%2 !=  0) {
                halfPowerSq = a*halfPowerSq;


               




            }
            return halfPowerSq;

        }
      
       
    public static void main (String args[]) {  

        int a = 2;
        int n = 10;
        System.out.println(optimizedPower(a,n));




       //int arr[] = {8,3,6,9,5,10,2,5,3};
     //  System.out.println(isSorted(arr, 0));
       
       // System.out.println(firstOccurence(arr,5,0));
      // System.out.println(lastOccurence(arr,5,0));
       
        //int n = 10;
      //  printDec(n);
      //printInc(n); 
    }
    
}
}
