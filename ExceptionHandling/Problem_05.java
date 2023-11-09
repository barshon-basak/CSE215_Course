/*
Write a program that creates a student object and sets the student's age. If the age is less than 5, the program should catch the exception and display an appropriate message.
*/
package javaapplication61;

class Student {
    private int age;

    public void setAge(int age) {
        if (age < 5) {
            throw new IllegalArgumentException("Age must be 5 or greater.");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class StudentExample {
    public static void main(String[] args) {
        Student student = new Student();

        // Set the student's age
        int studentAge = 4;  // Change this to the desired age

        try {
            student.setAge(studentAge);
            System.out.println("Student's age set to: " + student.getAge());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
