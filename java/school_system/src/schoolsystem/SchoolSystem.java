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

}
