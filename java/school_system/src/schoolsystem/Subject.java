package schoolsystem;

public class Subject {

    /*
    This attribute is private to protect the data and follow encapsulation.
    It can only be accessed or modified through methods (getters/setters)
    */
    private String name;

    // Constructor 
    public Subject(String name){
        this.name = name;
    }

    // Returns the subject name
    public String getName(){
        return name;
    }
}