package kodlamaiotempwebsite.entities;

public class Course {
    private static int sId;
    private int id;
    private String name;
    private String description;
    //img
    private float price;
    private Educator educator;
    private Category category;

    public Course(){     
    }
    
    public Course(String name, String description, float price, Educator educator, Category category) {
        this.id = sId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.educator = educator;
        this.category = category;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Educator getEducator() {
        return educator;
    }

    public void setEducator(Educator educator) {
        this.educator = educator;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }   
}
