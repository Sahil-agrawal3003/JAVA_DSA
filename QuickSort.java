import java.util.*;
public class QuickSort {
    public static void PrintArr(int arr[]){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static void quickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }

        //last element
        int PIdx = Parition(arr,si,ei);
        quickSort(arr, si, PIdx - 1);
        quickSort(arr, PIdx + 1, ei);



    }

    public static int Parition(int arr[], int si, int ei){
        int Pivot = arr[ei];
        int i = si - 1; //to make places for eles smaller than Pivot 
      
        for(int j = si ; j<ei; j++){
            if(arr[j] <= Pivot){
                i++;

            

             //Swap
             int temp = arr[j];
             arr[j] = arr[i];
             arr[i] = temp;

            }

        }
        i++;
        int temp = Pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;


       


    }

    public static void main(String args[]){
        int arr[] = {6,3,9,8,2,5};
        quickSort(arr, 0, arr.length - 1);
        PrintArr(arr);
       
    }
    
    
}
