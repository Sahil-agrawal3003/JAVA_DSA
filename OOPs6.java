public class OOPs6 {

    public static void main (String args[]){
     Queen q = new Queen();
     q.moves();
    }
    
} 

interface ChessPlayer{
    void moves();

}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,Left,Right,diagonal(in all 4 directions)");


    }
}

class Rook implements ChessPlayer{
    public void moves(){
       System.out.println("up,down,Left,Right");

    }
}

class King implements ChessPlayer{
    public void moves(){
       System.out.println("up,down,Left,Right,diagonal-(by 1 step)");

    }
}


