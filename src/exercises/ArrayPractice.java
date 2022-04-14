package exercises;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 5, 8};
        for(int element : array) {
            if(element % 2 != 0 ){
                System.out.println(element);
            }

        }
    }
}
