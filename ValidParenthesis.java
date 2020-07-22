//Link to problem: https://leetcode.com/problems/valid-parentheses/
//Solved Date: 6/10/2020

import java.util.*;

class Solution {
        public boolean isValid(String s) {
        Stack<Character> currentChars = new Stack<>();
        if(s == null || s.isEmpty())    
            return true;
        
        for(int i = 0; i < s.length(); i++){
            if(isLeftChar(s.charAt(i)))
                currentChars.push(s.charAt(i));
            else if(!isMatchingChar(currentChars, s.charAt(i)))
               return false; 
        }           
        return currentChars.empty();
    }
  
    public boolean isLeftChar(char currentChar){
        return currentChar == '(' || currentChar == '[' || currentChar == '{';  
    }
                    
    public boolean isMatchingChar(Stack<Character> charStack, char currentChar){
        if(!charStack.isEmpty()){
            if(currentChar == ')')
                return charStack.pop() == '(';
            
            if(currentChar == '}')
                return charStack.pop() == '{';
                
            if(currentChar == ']')
                return charStack.pop() == '[';
        }
        return false;
    }
}
