package exercises;

import java.util.ArrayList;

public class PrintWordsWithTwoLetters {
    public static void printWords (ArrayList list, int numLetters){
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).toString().length() == numLetters) {
                System.out.println(list.get(i));
            }
        }

    }
}
