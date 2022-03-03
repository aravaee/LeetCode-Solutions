class Solution {
    public boolean isValid(String s) {
        
        if(s.length() < 2){
            return false;
        }
        
        Stack<Character> stack= new Stack<>(); 
        
        for(char p: s.toCharArray()){
            
            if(!stack.empty() && p == ')' && stack.peek() == '(' ){
                stack.pop();
            }
            else if(!stack.empty() && p == '}' && stack.peek() == '{'){
                stack.pop();
            }
            else if( !stack.empty() &&p == ']' && stack.peek() == '['){
                stack.pop();
            }
            else{
                stack.push(p);
            }
        }    
        if(stack.empty()){
            return true;
        }
        return false;
    }
}