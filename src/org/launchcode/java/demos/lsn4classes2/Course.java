package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        if (!topic.equals(course.topic)) return false;
        if (!instructor.equals(course.instructor)) return false;
        return enrolledStudents.equals(course.enrolledStudents);
    }

    @Override
    public int hashCode() {
        int result = topic.hashCode();
        result = 31 * result + instructor.hashCode();
        result = 31 * result + enrolledStudents.hashCode();
        return result;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.

}
