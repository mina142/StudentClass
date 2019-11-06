import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Course> courses;

    public Student(){}

    public Student(String name, ArrayList<Course> courses) {
        this.name = name;
        this.courses = courses;
    }


    public String displayText(){
        String str = "";
        str += name + ":\n";
        for (Course c : courses) {
            str += c.getName() + ": " + c.getDescription() + ", " + c.getGrade() + "\n";
        }
        return str;
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

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

}
