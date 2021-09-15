/******************************************************************************
Luc Gaupin
COP2250

This program lets a user enter their average grades from exams, homework, and quizes, 
then calculates their overall grade on their 2 courses

*******************************************************************************/

//This is where i import all the important files to use certain methods and do certain calculations
import java.util.Scanner;
import java.lang.Math;

public class Course {
    // variable declaration here
    public double finalGrade;
    public double averageHomework;
    public double averageQuizes;
    public double averageExams;

    // create scanner in order to take in user input
    public Scanner myCourse = new Scanner(System.in);
   
    //Method (unit block of code) that calculates the final grade
    public void calculateFinalGrade () {

    // ***PLACE YOUR CODE HERE***
    System.out.println("========= ENTER INFO =========");
    System.out.println("Enter Average EXAM, HOMEWORK, & QUIZ grades: ");
   
    averageExams = myCourse.nextDouble();
    averageHomework = myCourse.nextDouble();
    averageQuizes = myCourse.nextDouble();
   
    //finalGrade = �
    finalGrade = (averageExams * 0.5) + (averageHomework * 0.3) + (averageQuizes * 0.2);
   
    //Show the final grade for the class to the screen...
    System.out.printf("The FINAL GRADE for this class is: %.2f\n\n", finalGrade);
    }
    
    // main method
    public static void main(String[] args){

    //Variable declaration(s) for main method
    double averageOverallGrade;
   
    //Creates an instance of the Course class (or a Course Object) and calls calculateFinalGrade
    Course myCourse1 = new Course();
    myCourse1.calculateFinalGrade();
   
    //Create a second object named myCourse2 here and calls calculateFinalGrade
    Course myCourse2 = new Course();
    myCourse2.calculateFinalGrade();
   
    // ***PLACE YOUR CODE HERE***
    averageOverallGrade = (myCourse1.finalGrade + myCourse2.finalGrade)/2;
   
    //Show on the screen the average grade of myCourse1 and myCourse2.
    System.out.println("========== SCORES ==========");
    System.out.println("The final grade of your first course is " + myCourse1.finalGrade);
    System.out.println("The final grade of your second course is " + myCourse2.finalGrade);
    System.out.println("The rounded DOWN grade for Test 1 is " + (int)myCourse1.finalGrade);
    System.out.println("The rounded DOWN grade for Test 2 is " + (int)myCourse2.finalGrade);
    System.out.println("The rounded UP grade for Test 1 is " + Math.round(myCourse1.finalGrade));
    System.out.println("The rounded UP grade for Test 2 is " + Math.round(myCourse2.finalGrade));
    System.out.println("The average OVERALL GRADE is: " + averageOverallGrade);
    
    // closes out so there isnt any memory leaks
    myCourse1.myCourse.close();
    myCourse2.myCourse.close();
    }
}
