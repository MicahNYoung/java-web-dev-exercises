package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student micahYoung = new Student("Micah Young", 0);
        System.out.println(micahYoung.getGradeLevel(micahYoung.getNumberOfCredits()));
        System.out.println(micahYoung.getGpa());
        micahYoung.addGrade(3, 1);
        micahYoung.addGrade(3, 2);
        System.out.println(micahYoung.getGpa());
    }
}
