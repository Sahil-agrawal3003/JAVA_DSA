import java.util.*;
public class mySearch{ 
  public static int buyAndSellStocks(int prices[]){ 
    int buyPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    for (int i = 0; i<prices.length; i++){
      if(buyPrice < prices[i]){
        int profit = prices[i] - buyPrice;
        maxProfit = Math.max(maxProfit , profit);


      }else{
        buyPrice = prices[i];
      }
    }
    return maxProfit;
  }






















  /*public static void maxSubarraySum(int numbers[]){
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    int prefix[] = new int[numbers.length];


    prefix[0] = numbers[0];
    //calculate prefix array
    for (int i = 1; i<prefix.length; i++ ){
      prefix[i] = prefix[i-1] + numbers[i];
    }

    for (int i = 0; i<numbers.length; i++){
      int start = i;

    }

    for (int j = i;  j<numbers.length; j++){
      int end = j;
      currSum = 0;

      currSum = start == 0 ?  prefix[end] : prefix[end] - prefix[start - 1];
 
      if (maxSum < currSum){
        maxSum = currSum;
      
    
    
    }
  }
  System.out.println(" max Sum = " + maxSum);
}
 public static void kadanes(int numbers[]){
  int ms = Integer.MIN_VALUE;
  int cs = 0;

  for(int i = 0; i<numbers.length; i++){
    cs = cs + numbers[i];
    if(cs < 0){
      cs = 0;
    }
    ms = Math.max(cs , ms);

  }
 } */


 /*public static int trappedRainwater(int height[]){
  int n = height.length;
  // calculate left max boundary array 
  int leftMax[] = new int[n];
  leftMax[0] = height[0];
  for (int i = 1; i<(n); i++){
    leftMax[i] = Math.max(height[i], leftMax[i-1]);
  } 

  //calculate right max boundary array
  int rightMax[] = new int[n];
  rightMax[n - 1] = height[n - 1];
  for (int i = n-2; i>=0; i--){
    rightMax[i] = Math.max(height[i], rightMax[i + 1]);
  }

  int trappedWater = 0;
  //loop
  for (int i = 0; i<n; i++){
    int waterLevel = Math.min(leftMax[i],rightMax[i]);
    trappedWater +=  waterLevel - height[i];
  }

  return trappedWater;
 } */
















  //SubArrays

    //public static void Subarrays(int numbers[]){ 
       
        //for (int i = 0; i<numbers.length; i++){
          // int start = i;
           //for (int j = i; j<numbers.length; j++){
            //int end = j;
            //int sum = 0;
               
            //for(int k = start; k<=end; k++){
              //  System.out.print(numbers[k] + " ");
               //sum += numbers[k]; 


            //}
            //System.out.println();
            //System.out.println(" sum " + sum);

           //}
           //System.out.println();


        //}
    //}















     //Reverse of numbers 
    // public static void reverse (int numbers[]){
      //  int first = 0, Last = numbers.length-1;

        //while(first<Last){
          //  int temp = numbers[Last];
            //numbers[Last] = numbers[first];
            //numbers[first] = temp;
            //first++;
            //Last--;

        //}
     // }
     
     
     // pairs
     //public static void printpairs(int numbers[]){
       // int tp = 0;
        //for (int i = 0; i<numbers.length; i++){
          //  int curr = numbers[i];
            //for (int j = i + 1; j<numbers.length; j++){
             //System.out.print("(" + curr + "," + numbers[j] + ")");
             //tp++;
            //}
            //System.out.println();

        //}
        //System.out.println("total pairs = " + tp);
    // }



    










    //binarySearch method



    //public static int binarySearch(int numbers[], int key){
      //  int start = 0, end = numbers.length - 1;
 
        //while(start <= end){ 
          //  int mid = (start + end) / 2;
            
            //comparison 

            //if (numbers [mid] == key){ 
              //  return mid;
            //} 
            //if (numbers [mid] < key){
              //  start = mid + 1;
            //}
            //else {  
              //  end = mid - 1;
            //}
           // }

            //return - 1; 
       // }






  
  
  
  
        public static void main(String args[]){
           //int numbers[] = {2,4,6,8,10,12,14};
             int prices[] = {7,1,5,3,6,4};
             System.out.println((buyAndSellStocks(prices)));
















           
                   //Subarrays(numbers);
            //int key = 4;
           // System.out.println("index for key is : " + binarySearch(numbers,key) );
           //reverse (numbers);
           //for (int i = 0; i<numbers.length; i++){
            //System.out.print(numbers[i] + " ");
          // }
           //System.out.println();

         //  printpairs(numbers);
        }


        


    }













