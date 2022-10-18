package kodlamaiotempwebsite.entities;

import java.util.ArrayList;

public class Category {
    private static int sId;
    private int id;
    private String name;
    private ArrayList<Course> courses;

    public Category(){
        this.id=sId;
        this.name = "noname";        
        courses = new ArrayList<Course>();
        sId++;
    }
    public Category(String name) {
        this.id = sId;
        this.name = name;
        courses = new ArrayList<Course>();
        sId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }    
}
