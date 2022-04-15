package studios;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class CountingCharacters {
    public static void main (String[] args) {
        HashMap<Character, Integer> currentChars = new HashMap<>();
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a String: ");
        String myString= input.nextLine();
        myString = myString.toLowerCase();
        char[] charactersInString = myString.toCharArray();

        for(int i = 0; i < charactersInString.length; i++) {
            if(Character.isLetter(charactersInString[i])){
                if(!currentChars.containsKey(charactersInString[i])){
                    currentChars.put(charactersInString[i], 1);
                } else {
                    currentChars.put(charactersInString[i], currentChars.get(charactersInString[i]) +1);
                }
            }

        }
System.out.println(currentChars);


    }
}
