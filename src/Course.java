public class Course {

    private String name;
    private String description;
    private double grade;

    public Course(){}

    public Course(String name, String description, double grade) {
        this.name = name;
        this.description = description;
        this.grade = grade;
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

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

}
