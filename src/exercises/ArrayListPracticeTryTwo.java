package exercises;
import java.util.ArrayList;
public class ArrayListPracticeTryTwo {
    public static void main(String[] args) {
        ArrayList<Integer> listOfNums = new ArrayList<>();
        for(int i=0; i < 16; i++) {
            listOfNums.add(i);
        }
        System.out.println(listOfNums);
        System.out.println("The sum is " + sum(listOfNums));
    }
    public static double sum(ArrayList list) {
        int sumVar = 0;
        for(int i = 0; i < list.size(); i++) {
        sumVar = sumVar + Integer.parseInt(list.get(i).toString());
        }
        return sumVar;
    }
}
