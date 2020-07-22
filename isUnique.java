//CTCI Problem #1.1, Arrays, HashTables, and Strings

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	 String inputFalse = "ffld"; //False, duplicate character
     String inputTrue = "field"; //True, no duplicate characters.
     System.out.println(isUnique(inputFalse));
     System.out.println(isUnique(inputTrue));
    }

    public static boolean isUnique(String inputStr){
        HashSet<Character> characterSet = new HashSet<>();
        for(int index = 0; index < inputStr.length(); index++){
            if(!characterSet.add(inputStr.charAt(index))){
                return false;
            }
        }
        return true;
    }
}
