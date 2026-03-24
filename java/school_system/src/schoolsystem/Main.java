package schoolsystem;

import java.util.Scanner;

public class Main {

    // Waits for user to press ENTER before returning to menu
    public static void waitForEnter(Scanner sc){
        System.out.println("\nPress ENTER to return to the main menu...");
        sc.nextLine();
    }

    public static void main(String[] args) throws Exception {

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
            System.out.print("\nChoose an option: ");

            option = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch(option){

                case 1:
                    System.out.println("--- Register Student ---");
                    for(int i = 0; i < 5; i++){
                        System.out.print("Enter student name: ");
                        studentNames[i] = sc.nextLine();
                    }
                    system.registerStudents(studentNames);
                    Thread.sleep(3000);
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    break;

                case 2:
                    System.out.println("--- Register Subject ---");
                    for(int j = 0; j < 3; j++){
                        System.out.print("Enter subject name: ");
                        subjectNames[j] = sc.nextLine();
                    }
                    system.registerSubjects(subjectNames);
                    Thread.sleep(3000);
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    break;

                case 3:
                    System.out.println("--- Register Grades ---");

                    for(int i = 0; i < 5; i++){
                        System.out.print("\nStudent: " + studentNames[i] + "\n");

                        for(int j = 0; j < 3; j++){
                            System.out.print("Enter grade for " + subjectNames[j] + ": ");

                            grades[i][j] = sc.nextDouble();
                            sc.nextLine(); // clear buffer after reading numbers
                        }
                    }
                    system.setGrades(grades);
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    break;

                case 4:
                    system.showTable();
                    waitForEnter(sc);
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    break;

                case 5:
                    system.showApproved();
                    waitForEnter(sc);
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    break;

                case 6:
                    system.showBestStudent();
                    waitForEnter(sc);
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    break;

                case 7:
                    system.showClassAverage();
                    waitForEnter(sc);
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    break;

                case 8:
                    system.showBestSubject();
                    waitForEnter(sc);
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    break;

                case 9:
                    system.showApprovedSorted();
                    waitForEnter(sc);
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    break;

                case 10:
                    system.showFailedSorted();
                    waitForEnter(sc);
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
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