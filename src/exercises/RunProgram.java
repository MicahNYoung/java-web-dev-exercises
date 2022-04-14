package exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class RunProgram {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What number would you like to enter?: ");
        int userNumber = Integer.parseInt(input.nextLine());


        String myString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] myArray = myString.split(" ");

        ArrayList<String> strList = new ArrayList<String>(Arrays.asList(myArray));
        PrintWordsWithTwoLetters.printWords(strList,userNumber);
    }

}
