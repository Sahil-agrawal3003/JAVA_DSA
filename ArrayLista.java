import java.util.*;

public class ArrayLista {
    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();
        ArrayList<String>list2 = new ArrayList<>();
        ArrayList<Boolean>list3 = new ArrayList<>();
        
        // add element:--
        list.add(1);  //O(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(1,9); //O(n);

        




        System.out.println(list);


        //Get Element- 0(1):--
        int element = list.get(2);
        System.out.println(element);

        // Delete :--

        list.remove(2);
        System.out.println(list);

        //Set:--

        list.set(2 ,10);
        System.out.println(list);

        //Contains:--
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));












    }
    
}
