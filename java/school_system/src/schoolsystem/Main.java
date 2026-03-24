package schoolsystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creates an instance of SchoolSystem to access its methods and manage the system data
        SchoolSystem system = new SchoolSystem();

        int option;

        String[] studentNames = new String[5];
        String[] subjectNames = new String[3];
        double[][] grades = new double[5][3];

        do {
            System.out.println("\n------ SCHOOL SYSTEM ------");
            System.out.println("1 - Register students");
            System.out.println("2 - Register subjects");
            System.out.println("3 - Register grades");
            System.out.println("4 - Show table");
            System.out.println("5 - Show approved");
            System.out.println("6 - Show best student");
            System.out.println("7 - Show class average");
            System.out.println("8 - Show best subject");
            System.out.println("9 - Show approved sorted");
            System.out.println("10 - Show failed sorted");
            System.out.println("0 - Exit");

            option = sc.nextInt();
            sc.nextLine();

            switch(option){

                case 1:
                    for(int i = 0; i < 5; i++){
                        System.out.println("Enter student name:");
                        studentNames[i] = sc.nextLine();
                    }
                    system.registerStudents(studentNames);
                    break;

                case 2:
                    for(int j = 0; j < 3; j++){
                        System.out.println("Enter subject name:");
                        subjectNames[j] = sc.nextLine();
                    }
                    system.registerSubjects(subjectNames);
                    break;

                case 3:
                    for(int i = 0; i < 5; i++){
                        System.out.println("Student " + (i+1));

                        for(int j = 0; j < 3; j++){
                            System.out.println("Enter grade:");
                            grades[i][j] = sc.nextDouble();
                        }
                    }
                    system.setGrades(grades);
                    break;

                case 4:
                    system.showTable();
                    break;

                case 5:
                    system.showApproved();
                    break;

                case 6:
                    system.showBestStudent();
                    break;

                case 7:
                    system.showClassAverage();
                    break;

                case 8:
                    system.showBestSubject();
                    break;

                case 9:
                    system.showApprovedSorted();
                    break;

                case 10:
                    system.showFailedSorted();
                    break;

                case 0:
                    System.out.println("Program finished.");
                    break;

                default:
                    System.out.println("Invalid option");
            }

        } while(option != 0);

        sc.close();
    }
}