package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits;
    private double sumOfQualityScore = 0;
    private double gpa = sumOfQualityScore/numberOfCredits;

    public double getSumOfQualityScore() {
        return sumOfQualityScore;
    }

    public void setSumOfQualityScore(double sumOfQualityScore) {
        this.sumOfQualityScore = sumOfQualityScore;
    }



    public String getName() {
        return this.name;
    }
    public int getStudentId() {
        return this.studentId;
    }
    protected int getNumberOfCredits() {
        return this.numberOfCredits;
    }
    protected double getGpa() {
        return this.gpa;
    }


    public int setNumberOfCredits(int newNumber) {
        return numberOfCredits = newNumber;
    }
    public double setGpa(double newGpa) {
        return gpa = newGpa;
    }

    public String getGradeLevel(int numCredits) {
        if(numCredits <= 29) {
            return "Freshman";
        } else if(numCredits <= 59) {
            return "Sophomore";
        } else if(numCredits <= 89) {
            return "Junior";
        } else if(numCredits >= 90) {
            return "Senior";
        } else {
            return "Invalid credit entry";
        }
    }

    public double addGrade (int numCredits, double grade){
        //gpa = (total quality score) / (total number of credits)
        //quality score  = letter grade score 0.0 - 4.0 X num of credits in class
        //total quality score = sum of all quality scores
        setNumberOfCredits(this.numberOfCredits += numCredits);
        setSumOfQualityScore(this.sumOfQualityScore += grade * numCredits);
        setGpa(sumOfQualityScore/numberOfCredits);
        return -1;
    }

    Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (studentId != student.studentId) return false;
        if (numberOfCredits != student.numberOfCredits) return false;
        if (Double.compare(student.sumOfQualityScore, sumOfQualityScore) != 0) return false;
        if (Double.compare(student.gpa, gpa) != 0) return false;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + studentId;
        result = 31 * result + numberOfCredits;
        temp = Double.doubleToLongBits(sumOfQualityScore);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(gpa);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}