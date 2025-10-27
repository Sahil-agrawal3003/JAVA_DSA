import java.util.LinkedList;
public class Classsroom {
   public static void main(String args[]){

    //create

    LinkedList<Integer>ll = new LinkedList <>();

    //add
    ll.add(1);
    ll.add(2);
    ll.add(0);
    
    // 0->1->2

    System.out.println(ll);


    //remove
    ll.removeLast();
    ll.removeFirst();
    System.out.println(ll);


    


   }
    

    
}
