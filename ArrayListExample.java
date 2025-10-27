import java.util.*;

public class ArrayListExample { 
    public static void main (String args[]){
        ArrayList<Integer>list = new ArrayList<>();
        ArrayList<String>list2 = new ArrayList<>();
        ArrayList<Boolean>list3 = new ArrayList<>();

       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);
       list.add(6);

     //  list.add(1,9);


       //System.out.println(list);

       //Get Operations:---
      // int element = list.get(2);
      // System.out.println(element);

      //Delete Operations:--
      //list.remove(2);
      //System.out.println(list);

      //Set Operations:--
      // list.Set(2,10);
      // System.out.println(list);

      //contains:--
      // System.out.println(list.contains(1));
      // System.out.println(list.contains(11));

       // print the array list:--
    //    for(int i = 0; i<list.size(); i++){
    //     System.out.print(list.get(i) + " ");

    //    }

    //       System.out.println();

    // }
 
    // Reverse the array:--

//  for(int i = list.size()-1; i>=0; i--){
//         System.out.print(list.get(i) + " ");

//        }

//           System.out.println();


     // Maximum element in the ArrayList:--
     int max = Integer.MIN_VALUE;

     for(int i = 0; i<list.size(); i++){
        // if(max < list.get(i)){
        // max = list.get(i);

      //  }

       max = Math.max(max,list.get(i));

     }
     System.out.println("max element = " + max);

    }

}
 


    

