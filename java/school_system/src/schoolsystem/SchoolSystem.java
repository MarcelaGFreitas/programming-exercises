package schoolsystem;

import java.util.ArrayList;
import java.util.Collections;

public class SchoolSystem {

    private Student[] students;
    private Subject[] subjects;

    private ArrayList<String> approved;
    private ArrayList<String> failed;

    // Constructor - initializes all arrays and lists 
    public SchoolSystem(){
        students = new Student[5];
        subjects = new Subject[3];

        approved = new ArrayList<>();
        failed = new ArrayList<>();
    }

    // Register students - for each name in the array, create a Student object and store it in the students array
    public void registerStudents(String[] names){
        for(int i = 0; i < 5; i++){
            students[i] = new Student(names[i]);
        }
    }

    // Register subjects
    public void registerSubjects(String[] names){
        for(int j = 0; j < 3; j++){
            subjects[j] = new Subject(names[j]);
        }
    }

    // Set grades
    public void setGrades(double[][] grades){
        for(int i = 0; i < 5; i++){    // iterates through the students
            for(int j = 0; j < 3; j++){    // iterates through the subjects
                students[i].setGrade(j, grades[i][j]);    // It gets the student i, takes the grade for a specific subject j, and stores it in the Student object
            }
        }
    }

     // Show table - displays a table with students, their grades, and their averages
    public void showTable(){
        System.out.print("Student\t");

        for(int j = 0; j < 3; j++){
            System.out.print(subjects[j].getName() + "\t");    // prints the name of all subjects
        }
        System.out.println("Average");
        for(int i = 0; i < 5; i++){    // loop through each student
            System.out.print(students[i].getName() + "\t");

            for(int j = 0; j < 3; j++){    // loop through each subject
                System.out.print(students[i].getGrades()[j] + "\t");
            }
            System.out.println(students[i].calculateAverage());    // print the student's average at the end of the row
        }
    }

    // Approved students - identifies approved students and displays their names
    public void showApproved(){
        approved.clear();    // clears the list to avoid duplicate data from previous executions

        for(int i = 0; i < 5; i++){
            if(students[i].isApproved()){
                approved.add(students[i].getName());
            }
        }

        System.out.println("Approved:");
        for(int i = 0; i < approved.size(); i++){
            System.out.println(approved.get(i));
        }
    }

    // Best student - find the student with the highest average and prints their name and average
    public void showBestStudent(){
        int best = 0;    // student at position 0 is considered the best - for now

        for(int i = 1; i < 5; i++){    // starts with 1 cause index 0 is initially considered the best student
            if(students[i].calculateAverage() > students[best].calculateAverage()){
                best = i;    
            }
        }
        System.out.println("Best student: " + students[best].getName());
        System.out.println("Average: " + students[best].calculateAverage());
    }

    // Class average - calculates the overall class average (by summing all student's and dividing by the total number of grades)
    public void showClassAverage(){
        double total = 0;    // sum of all grades
        int count = 0;    // total numbers of grades

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 3; j++){
                total += students[i].getGrades()[j];
                count++;
            }
        }
        System.out.println("Class average: " + (total / count));
    }

    // Best subject - finds and displays the subject with the highest average grade
    public void showBestSubject(){
        double bestAvg = 0;
        int bestIndex = 0;

        for(int j = 0; j < 3; j++){    // loop through each subject
            double sum = 0;

            for(int i = 0; i < 5; i++){    // loop through each student
                sum += students[i].getGrades()[j];
            }
            double avg = sum / 5;

            if(avg > bestAvg){
                bestAvg = avg;
                bestIndex = j;
            }
        }
        System.out.println("Best subject: " + subjects[bestIndex].getName());
    }

     // Approved sorted - sorts and displays the list of approved students in alphabetical order
    public void showApprovedSorted(){
        Collections.sort(approved);

        System.out.println("Approved (Alphabetical Order):");
        for(int i = 0; i < approved.size(); i++){
            System.out.println(approved.get(i));
        }
    }

    // Failed sorted - filters, sorts, and displays the list of failed students in alphabetical order
    public void showFailedSorted(){

        failed.clear();    // clears the failed list to remove old data before adding new results

        for(int i = 0; i < 5; i++){
            if(!students[i].isApproved()){
                failed.add(students[i].getName());
            }
        }

        Collections.sort(failed);

        System.out.println("Failed (Alphabetical Order):");
        for(int i = 0; i < failed.size(); i++){
            System.out.println(failed.get(i));
        }
    }
}



