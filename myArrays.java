
import java.util.*;
public class myArrays{  

    public static void update(int marks[], int nonChangable){
        nonChangable = 10;
        for (int i = 0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }

    public static void main (String args[]){ 
        

        int marks[] = {98,99,92};
        int nonChangable = 5;
        update(marks,nonChangable);
        System.out.println(nonChangable);
        


        //print our marks

        for (int i = 0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    
    //    int marks [] = new int [100];

   //  Scanner sc = new Scanner(System.in);

     //   System.out.println("length of array = " + marks.length);
    
     

   //marks[0]= sc.nextInt(); //phy

// marks[1] = sc.nextInt(); //chem





//rks[2] = sc.nextInt(); //maths






 

 //em.out.println("phy : " + marks[0]);
//stem.out.println("chem : " + marks[1]);
//stem.out.println("maths : " + marks[2]);


//t percentage = (marks[0] + marks[1] + marks[2]) / 3;
//stem.out.println("percentage = " + percentage + "%");







        


    }










}

