package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradebookHashMap {
    public static void main(String[] args) {
        HashMap<String, String> studentHashMap = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String id;

        System.out.println("Enter the student's ID, then press enter again to finish: ");

        do {

            System.out.println("ID: ");
            id = input.nextLine();

            if(!id.equals("")) {
                String name;
                System.out.println("Name:");
                name = input.nextLine();
                studentHashMap.put(id, name);

//                input.nextLine();
            }
        } while(!id.equals(""));

        System.out.println("\nStudents: ");
        for(Map.Entry<String, String> student: studentHashMap.entrySet()) {
            System.out.println(student.getKey() + ": " + student.getValue());
        }
    }
}
