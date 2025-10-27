import .java.util.*;
public class Balancedparenthesis {
    public static void Main(String args[]){
        stack<Character> stack = new Stack<>();
        for(char ch:strtocharArray()){
            if(ch == '(' || ch = "(" || ch = '(' ){
                Stack.push(ch);

            }else if(ch == ')' || ch = ")" || ch = ')'){
                if(stack.isEmpty()){
                    return false;
                    
                }
            }
        }
        
         

        
    }
    
}
