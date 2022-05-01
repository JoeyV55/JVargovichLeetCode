package ArraysStrings;

import java.util.HashMap;
//This is NOT the most optimal solution. The most optimal is achieved by sorting. 
//https://leetcode.com/problems/valid-anagram/discuss/1870094/Java-3-Solutions%3A-HashMap-Sort-and-Count-or-Count-is-the-Fastest
//TODO: Recode with optimal sorting solution.
class Solution {
    public boolean isAnagram(String s, String t) {
         //Check if they are the same length
        if(s.length() != t.length()){
            return false;
        }
        
        //Hashmap will contain the character, and count in the first word.
        HashMap<Character, Integer> sHashMap = new HashMap<>();
        
        //Build the first one.
        for(int i = 0 ; i < s.length(); i++){
            //Incrememnt in map if character exists
            if(sHashMap.get(s.charAt(i)) != null){
                sHashMap.put(s.charAt(i), sHashMap.get(s.charAt(i)) + 1);
            }
            //Otherwise not in the string
            else{
                sHashMap.put(s.charAt(i), 1);
            }
        }
        //Second map is what we will determine the anagram with
        for(int j = 0; j < t.length(); j++){
            //Cant find matching char.
            if(sHashMap.get(t.charAt(j)) == null){
                return false; 
            }
            //If there is the character, but not enough of them left.
            if(sHashMap.get(t.charAt(j)) == 0){
                return false;
            }
            //Peel off a character.
            else{
                sHashMap.put(t.charAt(j), sHashMap.get(t.charAt(j)) - 1);
            }
            
        }
        
        //We have an anagram
        return true;
    }
}