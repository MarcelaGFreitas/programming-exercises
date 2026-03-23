package schoolsystem;

// This class represents a student with name and grades
public class Student {

    private String name;
    private double[] grades;

    // Constructor initializes student name and creates array for 3 grades
    public Student(String name){
        this.name = name;
        grades = new double[3];
    }

    // Returns student name
    public String getName(){
        return name;
    }

    // Sets a grade in a specific position (subject index)
    public void setGrade(int j, double grade){
        try {
            grades[j] = grade;
        } catch (Exception e) {
            System.out.println("Invalid grade index.");
        }
    }

    // Returns all grades
    public double[] getGrades(){
        return grades;
    }

    // Calculates the average of the 3 grades
    public double calculateAverage(){
        double sum = 0;

        for(int j = 0; j < 3; j++){    // j = 0 -> first subject
            sum += grades[j];    
        }

        return sum / 3;    // student's overall average across the three subjects
    }

    // Checks if student is approved (average >= 7)
    public boolean isApproved(){
        return calculateAverage() >= 7;
    }
}