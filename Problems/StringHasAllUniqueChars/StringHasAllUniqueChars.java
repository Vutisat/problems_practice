package StringHasAllUniqueChars;

import java.util.HashSet;
import java.util.Set;

public class StringHasAllUniqueChars {

    public static void main(String[] args) {
        String input = "asdfghjklqwertyuiopzxcvbnm";
        String input2 = "aasdfghjklqwertyuiopzxcvbnm";

        System.out.println(checkIfAllCharactersInStringAreUnique(input));
        System.out.println(checkIfAllCharactersInStringAreUnique(input2));
    }

    private static boolean checkIfAllCharactersInStringAreUnique(String input){

        Set<Character> hashtableOfChars = new HashSet<>();

        for(int i = 0; i < input.length(); i++){
            if(hashtableOfChars.contains(input.charAt(i))){
                return false;
            } else {
                hashtableOfChars.add(input.charAt(i));
            }
        }

        return true;
    }

}
