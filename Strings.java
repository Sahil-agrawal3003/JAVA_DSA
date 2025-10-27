import java.util.*;

public class Strings {
    public static boolean isPalindrome(String str) {
        for(int i = 0; i<str.length()/2; i++){
            int n = str.length();
             if(str.charAt(i) != str.charAt(n-1-i) ){
                return false;

             }

             

                }
                return true;
        
            }


            public static float getShortestPath(String Path){
                int x = 0, y = 0;

                for(int i = 0; i<Path.length(); i++){
                   char dir = Path.charAt(i);
                   
                   //south
                   if (dir == 'S'){
                    y--;

                   }

                   //north
                   else if (dir == 'N'){
                    y++;
                   }
                   //west
                   else if (dir == 'W'){
                    x--;
                   }
                   //east
                   else {
                    x++;
                   }
                }

                int X2 = x*x;
                int Y2 = y*y;
                return (float)Math.sqrt(X2 + Y2);
            }

            public static String subString(String str, int si, int ei){
            String substr = "";
            for(int i=si; i<ei; i++){
                substr += str.charAt(i);


            }
            return substr;
        }

        public static String toUpperCase(String str){
         StringBuilder sb = new StringBuilder("");

         char ch = Character.toUpperCase(str.charAt(0));
         sb.append(ch);

         for (int i = 1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
               sb.append(str.charAt(i));
               i++;
               sb.append(Character.toUpperCase(str.charAt(i)));

            }else{
               sb.append(str.charAt(i));
            }
            
         }
         return sb.toString();
        }

        
        
    public static void main (String args[]){
       /*  char arr[] = {'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("xyz");
       
        //String are IMMUTABLE;
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();

       */

       //String fullName = "Tony Stark";
       //System.out.println(fullName.length());

     //  String firstName = "Sahil";
       //String lastName = "Agrawal";
      // String fullName = firstName+ " " + lastName;
      // System.out.println(fullName);

     // String str = "sahil";
     // System.out.println(isPalindrome(str));


     

     //Shortest Path
    // String Path = "WNEENESENNN";
     // System.out.println(getShortestPath (Path));


    // String s1 = "Tony";
     //String s2 = "Tony";
     //String s3 = new String ("Tony");


     /*if(s1 == s2){
        System.out.println("Strings are equal");
     } else {
        System.out.println("Strings are not equal");
     }


     if(s1 == s3){
        System.out.println("Strings are equal");
     } else {
        System.out.println("Strings are not equal");
     } */

    // if (s1.equals(s3)){
      //  System.out.println("Strings are equal");

     //} else{

       //  System.out.println("Strings are not equal");

     //}
      
    // String str = "HelloWorld";
   //  System.out.println(subString(str, 0, 5));
      
     // String fruits[] = {"apple", "mango","banana"};
       //     String largest = fruits[0];
         //   for(int i = 0; i<fruits.length; i++){
           //     if(largest.compareTo(fruits[i]) < 0){
             //       largest = fruits[i];
                    
               // }
          //  } 
    //   System.out.println(largest);
      
     /*  StringBuilder sb = new StringBuilder("");
      for(char ch ='a'; ch<='z'; ch++){
         sb.append(ch);
         //abcdefghijklamnopqrstuvwxyz
         //o(26)
         //o(n^2)

      }
        
        
    */ // System.out.println(sb.length());
    String str = "hi , i am sahil";
    System.out.println(toUpperCase(str));

    
   }
    
}

