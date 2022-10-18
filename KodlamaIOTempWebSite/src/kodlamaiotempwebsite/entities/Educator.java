package kodlamaiotempwebsite.entities;

import java.util.ArrayList;

public class Educator {
    private static int sId = 0;
    private int id;
    private String firstName;
    private String lastName;
    private ArrayList<Course> courses;

    public Educator(){
        this.id = sId;
        this.firstName = "noname";
        this.lastName = "noname";
        courses = new ArrayList<>();
        sId++;
    }    
    
    public Educator(String firstName, String lastName) {
        this.id = sId;
        this.firstName = firstName;
        this.lastName = lastName;
        courses = new ArrayList<>();
        sId++;
    }    

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }   
}
