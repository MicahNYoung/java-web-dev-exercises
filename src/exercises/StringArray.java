package exercises;

public class StringArray {
    public static void main(String[] args) {
        String myString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] myArray = myString.split("\\.");
        for(String element : myArray) {
            System.out.println(element);
            System.out.println();
        }}

}
