#include <stdio.h>
#include <stdbool.h>

int main() {
    int totalStudents;
    int option;

    printf("--- Academic Management System ---\n");
    printf("How many students do you want to process? ");
    scanf("%d", &totalStudents);

    // array to store each student's status
    int status[totalStudents];

    float n1, n2, n3, average;
    int attendance;

    for (int i = 0; i < totalStudents; i++) {

        printf("\n--- Student %d Data ---\n", i + 1);
        printf("Enter the 3 grades:\n");
        scanf("%f %f %f", &n1, &n2, &n3);

        average = (n1 + n2 + n3) / 3;

        do {
            printf("Enter attendance (0 to 100): ");
            scanf("%d", &attendance);

            if (attendance < 0 || attendance > 100) {
                printf("Error! Invalid attendance.\n");
            }

        } while (attendance < 0 || attendance > 100);

        // define student status
        if (average >= 6.0) {
            status[i] = 1;   // approved
        } else if (average >= 2.0) {
            status[i] = 2;   // recovery
        } else {
            status[i] = 3;   // failed
        }
    }

    printf("\n--- MENU ---\n");
    printf("1 - View Status of All Students\n");
    printf("2 - Exit\n");
    printf("Option: ");
    scanf("%d", &option);

    switch (option) {

        case 1:
            printf("\n--- STUDENT STATUS ---\n");
            for (int i = 0; i < totalStudents; i++) {
                printf("Student %d: ", i + 1);

                if (status[i] == 1) {
                    printf("Approved\n");
                } else if (status[i] == 2) {
                    printf("Recovery\n");
                } else {
                    printf("Failed\n");
                }
            }
            break;

        case 2:
            printf("Closing program...\n");
            break;

        default:
            printf("Invalid option.\n");
            break;
    }

    printf("\nProcessing completed.\n");
    return 0;
}