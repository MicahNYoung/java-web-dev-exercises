package marcusChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.lang.Math;
import java.util.Iterator;
public class SquareNumberRemover {

    //The problem with this approach is that it's potentially possible that the I cannot start
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<Integer>(Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
        ArrayList<Integer> myArrayList2;
//        new ArrayList<Integer>(Arrays.asList(
//                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
        ArrayList<Integer> newArrayList = new ArrayList<Integer>();
//
//        What we need to keep track of:
//              Current Value, comparison value
//        What we need to do:
//              Compare two numbers, establish if their sum is a Square number, if it is
        //      push both number to new list, remove from old.
        //      Compare last element's value of new array to items in old array
        //      find one that adds to it to be a square number.
//        for(Integer i : myArrayList)
//                int firstNum = myArrayList.get(0);
//
//
//
//            }


//Loops if got incorrect
    int currentNum = myArrayList.get(0);
    int currentNumIndex = 0;
    int sum = 0;
    newArrayList.add(currentNum);
    myArrayList.remove(0);
//    Iterator itr = myArrayList.iterator();
do {
    currentNum = myArrayList.get(currentNumIndex);
    myArrayList2 = myArrayList;
    while(myArrayList.size() > 0) {
        myArrayList2 = myArrayList;
//        if(currentNumIndex == 1){
//            newArrayList.add(currentNum);
//            continue;
//        }
        for(Integer i : myArrayList){
            sum = currentNum + i;
            if (Math.sqrt(sum) % 1 == 0) {
                if(newArrayList.contains(i)){
                    continue;
                }
                newArrayList.add(myArrayList2.get(myArrayList2.indexOf(i)));
                currentNum = myArrayList2.get(myArrayList2.indexOf(i));
                myArrayList.remove(i);
                break;

//                if(i > 1) {
//                    newArrayList.add(myArrayList2.get(myArrayList2.indexOf(i)));
//                }

//                else {
//                    newArrayList.add(myArrayList2.get(myArrayList2.indexOf(i) - 1));
//                }

            }

        }
        System.out.println(newArrayList);
        currentNumIndex = myArrayList2.get(myArrayList2.indexOf(currentNum)) + 1;

    }
    System.out.println(newArrayList);
    System.out.println("hi");

//            num


}while (myArrayList.size() > 0);

    }
}
