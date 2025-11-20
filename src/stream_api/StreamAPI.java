package stream_api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Streams solve two pain points:

 * boilerplate loops

 * complex transformations

 * Streams allow:

 * filtering

 * mapping

 * sorting

 * grouping

 * aggregating

 * All without mutating the original collection.

 * A stream starts from a collection, processes in a pipeline and returns a new result
 */

public class StreamAPI {

    private class Student {
        private String fullName;
        private boolean isClearedFees;
        private Character grade;

        public Student(String fullName, Character grade, boolean isClearedFees) {
            this.fullName = fullName;
            this.grade = grade;
            this.isClearedFees = isClearedFees;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public void setClearedFees(boolean isClearedFees) {
            this.isClearedFees = isClearedFees;
        }

        public void setGrade(char grade) {
            this.grade = grade;
        }

        public String getFullName() {
            return fullName;
        }

        public boolean getIsClearedFees() {
            return isClearedFees;
        }

        public Character getGrade() {
            return grade;
        }

        public String toString() {
            return "Name: " + fullName + " Grade: " + grade + " Fee Status: " + isClearedFees;
        }

    }

    public void streamApiImpl() {
        // Step 1: Create a list of students, about 10, with different data values.
        List<Student> students = new ArrayList<>();
        Collections.addAll(students, new Student("Student One", 'C', true),
                new Student("Student Two", 'D', true),
                new Student("Student Three", 'A', false),
                new Student("Student Four", 'B', true),
                new Student("Student Five", 'D', false),
                new Student("Student Six", 'E', true),
                new Student("Student Seven", 'D', false),
                new Student("Student Eight", 'A', false),
                new Student("Student Nine", 'C', true),
                new Student("Student Ten", 'E', true));

        // Task One: Implement stream api, return students whose fees have been cleared, sort the grades in ascending order
        List<Student> clearedFees = students.stream()
                .filter(s -> s.isClearedFees)
                .toList();

        for (Student student : clearedFees) {
            System.out.println(student + "\n");
        }

        // Task two: Return students who will be listed for graduation. A student can only proceed if they have a grade 'A', 'B', and 'C' and has cleared fees
        List<Student> bonafiedStudents = students
                .stream()
                .filter(s -> s.isClearedFees && s.grade == 'A' || s.grade == 'B' || s.grade == 'C')
                .toList();

        /**
         * Expected Output:
         * Student One
         * Student Four
         * Student Nine
         */

        for (Student student : bonafiedStudents) {
            System.out.println(student);
        }



    }

}
