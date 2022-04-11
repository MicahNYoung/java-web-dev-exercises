package exercises;

import java.awt.desktop.SystemEventListener;
import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String aliceInWonderLandFirstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);

        System.out.println("What word would you like to search for?: ");
        String searchWord = input.nextLine();
        input.close();

        String[] sentenceWords = aliceInWonderLandFirstSentence.split(" ");


        for(int i = 0; i < sentenceWords.length; i++) {
            Boolean wordIncluded = searchWord.toLowerCase(Locale.ROOT).equals(sentenceWords[i].toLowerCase(Locale.ROOT));
            String copyOfSentenceWords = "";
            String[] finalCopyOfSentenceWords;
            if(wordIncluded){
                System.out.println(wordIncluded);
                System.out.println("index is " + i);
                for(int j = 0; j < sentenceWords.length; j++) {
                    if(!sentenceWords[j].equals(searchWord)){
                        copyOfSentenceWords = copyOfSentenceWords + " " + sentenceWords[j];
                    }

                }
                finalCopyOfSentenceWords = copyOfSentenceWords.split(" ");
                System.out.println(finalCopyOfSentenceWords[0]);
                break;
            } else if (i == sentenceWords.length - 1){
                System.out.println(wordIncluded);
            }

        }

//        System.out.println("It is " + wordIncluded + " that the word, " +searchWord + " is in this sentence");
    }
}
