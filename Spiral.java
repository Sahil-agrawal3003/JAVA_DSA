public class Spiral {   
public static void PrintSpiral(int matrix[][]){
    int startRow = 0; 
    int startCol = 0;
    int endRow = matrix.length-1;
    int endCol = matrix[0].length-1;

    while(startRow <= endRow && startCol<=endCol){
        //top 
        for(int j = startCol; j<=endCol;j++){
            System.out.println(matrix[startRow][j]+" ");

        } 

        //right 
        for(int i = startRow+1; i<=endRow; i++){
            System.out.println(matrix[endCol][i]+" ");

        } 
        //bottom

        for(int j = endCol-1; j>=startCol; j--){
            System.out.println(matrix[endCol][j]+" ");
            
        }
        //left

        for(int j = endRow-1; j>=startRow+1; j--){
            System.out.println(matrix[startCol][j]+" ");
            
        }
    startCol++;
    startRow++;
    endCol--;
    endRow--; 
    }  
    System.out.println();
}
 // ArraysCC
//public class  ArraysCC {
   // public static void update(int marks[]){
      //  for (int i = 0; i<marks.length; i++){
      //      marks[i] = marks[i] + 1;
       // }
    //}
 /*  public static void main (String args[]){
        int marks[] = {97,98,99};
        update(marks);

        for (int i = 0; i<marks.length; i++){
            System.out.println(marks[i] + " ");
        }
        System.out.println();
    } */

  // public static int linearSearch (int numbers[], int key){
    //    for(int i = 0; i<numbers.length; i++){
      //      if (numbers[i] == key){
        //        return i;
          //  }
       // }

       // return -1;
    // } 

//tic int linearSearch (String menu[], String key){
    //  for(int i = 0; i<menu.length; i++){
      //    if (menu[i] == key){
        //      return i;
          //}
      //}

       //eturn -1;
   //}


   // printlargest number : --


//public static int getLargest(int numbers[]){
  //    int largest = Integer.MIN_VALUE;
    //  int smallest = Integer.MAX_VALUE;
    

  //for(int i = 0; i<numbers.length; i++){
    //if(largest < numbers[i]){
      //largest = numbers[i];

        //}

    //if(smallest > numbers[i]){
      //smallest = numbers[i];      }    
  //
    

    
  //return largest;

//}
  // binarySearch : --
// public static int binarySearch(int numbers[] , int key){
  //  int start = 0,end = numbers.length - 1;
  //  while(start <= end){
   //     int mid = (start + end)/2;

        //comparisons
     //   if(numbers[mid] == key){
       //     return mid;
      //  }
      //  if(numbers[mid]<=key){ //right
        //    start = mid + 1;

     //   } else{ //left
       //     end = mid - 1;

      //  }

        
  //  }

  //  return - 1;
  //  }
     // reverse number: --
//  public static void reverse(int numbers[]){
  //  int first = 0, last = numbers.length-1;
  //  while(first < last){
        // swap 
    //    int temp = numbers[last];
      //  numbers[last] = numbers[first];
        //numbers[first] = temp;
       // first ++; 
       // last --; 
  //  } 
 // } 
// printPairs: --
//   public static void  printPairs(int numbers[]){
// int tp = 0;
//  for(int i = 0; i<numbers.length; i++){
 //   int curr = numbers[i];
  
//  for(int j = i+1; j<numbers.length; j++){
  //  System.out.println("(" + curr + "," + numbers[j] + ")");
//  }
//  System.out.println();
//  }

//  }

//printSubarrays: --
/* 
public static void printSubarrays(int numbers[]){
  int ts = 0; 
  for(int i = 0; i<numbers.length; i++){
    int start = i;
    for(int j = i; j<numbers.length; j++){
      int end = j;
      for(int k = start; k<=end; k++){
        System.out.print(numbers[k] + " ");
      }
      ts++ ;
      System.out.println();

    }
    System.out.println();
  }
   System.out.println("total subarrays = " + ts);
}   */


// maxsubarraysum: --
/* 
public static void maxSubarraySum(int numbers[]){
  int currSum = 0; 
  int maxSum = Integer.MIN_VALUE;

  for(int i = 0; i<numbers.length; i++){
    int start = i;
    for(int j = i; j<numbers.length; j++){
      int end = j;
      currSum = 0;

      for(int k = start; k<=end; k++){
        //subarray sum
        currSum += numbers[k];

      }
      System.out.println(currSum);
      if(maxSum < currSum){
        maxSum = currSum;

      }
      
   

    }
    
  }
   System.out.println("max sum  = " + maxSum);
}
*/

//maxSum array using prefix//
// maxsubarraysum: --
/* 
public static void maxSubarraySum(int numbers[]){
  int currSum = 0; 
  int maxSum = Integer.MIN_VALUE;
  int prefix[] = new int[numbers.length];
  prefix[0] = numbers[0];
  for(int i = 1; i<prefix.length; i++){
    prefix[i] = prefix[i - 1] + numbers[i];

  }


  for(int i = 0; i<numbers.length; i++){
    int start = i;
    for(int j = i; j<numbers.length; j++){
      int end = j;
      currSum = start == 0 ? prefix[end]: prefix[end] - prefix[start - 1];
      if(maxSum < currSum){
        maxSum = currSum;

      }

   
      }
      

      }
      
   

    
    
  
   System.out.println("max sum  = " + maxSum);
    }
   */

   //kadanes algorithm : --
 /*   public static void kadanes(int numbers[]){
    int ms = Integer.MIN_VALUE;
    int cs = 0;
    for(int i = 0; i<numbers.length; i++) {
      cs = cs + numbers[i];
      if(cs < 0){
        cs = 0;

      }
      ms = Math.max(cs,ms);
     }
     System.out.println("our max subarray sum is : " + ms);
    }   

    */

    //trappedrainwater:--
   /*  public static int trappedRainwater(int height[]){
      int n = height.length;
      
      //Leftmax:--
      int LeftMax[] = new int[n];
      LeftMax[0] = height[0];
      for(int i = 1; i<n; i++){
        LeftMax[i] = Math.max(height[i] , LeftMax[i - 1]);

      }

      //RightMax:--
      int rightMax[] = new int[n];
      rightMax[n - 1] = height [n - 1];
      for(int i = n - 2; i>=0; i--){
        rightMax[i] = Math.max(height[i] , rightMax[i + 1]);



        
      }
      int trappedwater = 0;
      for(int i = 0; i<n; i++){
        int waterLevel = Math.min(LeftMax[i], rightMax[i]);
        trappedwater += waterLevel - height[i];

      }

      return trappedwater;

      


    }   */
     /* 
    // Tiling Problem: --
  public static int tilingProblem(int n){
    // base case
    if(n == 0 || n == 1){
      return 1;

    }
    //kaam
    //vertical choice
    int fnm1 = tilingProblem(n - 1);

    //horizontal choice:--
    int fnm2 = tilingProblem(n - 2);

    int totWays = fnm1;
    return totWays;

    
  }
   */

    //remove deplicates:--
  public static void removeDuplicates(String Str, int idx, String Builder newStr, boolean map[]){
    if(idx == str.length()){
      System.out.println(new Str);
      return ;
    }
    //kaam
    char currchar = str.charAt(idx);
    if(map[currchar - 'a'] == true ){
      // duplicate:--
      removeDuplicates(str, idx+1,newStr,map);


    }else{
      map[currchar - 'a'] == true;
      removeDuplicates(str,idx+1,newstr.append[currchar],map);

    }
  }
  

 
 

public static void main (String [] args){
/*int matrix [][] = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};

    PrintSpiral(matrix); */
    
   // int numbers[] = {2,4,6,8,10};
   // int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
   //int key = 10;

    //int index = linearSearch(numbers, key);
    //if(index == -1){
      //  System.out.println("Not Found");
    //}
    //else {
      //  System.out.println("Key is at index : " + index);
   // } 
           
   
  // String menu[] = {"dosa","coke","cholebature","cocacola"};
  // String key = "coke";

   //int index = linearSearch (menu , key);

   //if (index == -1){
    //System.out.println("Items not found in menu.");

   //}else{
    // System.out.println("Items found at index: " + index);\
      
   // reverse(numbers);
    
  // System.out.println("index for key is : " + binarySearch(numbers, key));
  //   for(int i = 0; i<numbers.length;i++){
    //      System.out.println(numbers[i] + " ");

        
   //  }
   //  System.out.println();
// printSubarrays (numbers); 

//maxSunarraysum(numbers);
 /* 
kadanes(numbers);
*/


/* 
int height [] = {4,2,0,6,3,2,5};
  System.out.println(trappedRainwater(height));

    
   //printpairs(numbers)
   */
    //tiling Problem:--
   // System.out.println(tilingProblem(4));

   // Remove Duplicates:--
   String str = "appnnacollege";
   removeDuplicates(str,0,newStringBuilder(""),newboolean[26]);



   }



}
    

 