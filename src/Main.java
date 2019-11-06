import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        ArrayList<Course> courses = new ArrayList<>();
        Course course1 = new Course();
        course1.setDescription("course 1");
        course1.setGrade(90.2);
        course1.setName("Java");
        courses.add(course1);

        course1 = new Course();
        course1.setName("Python");
        course1.setGrade(80);
        course1.setDescription("p");
        courses.add(course1);

        Student st = new Student();
        st.setName("joe");
        st.setCourses(courses);
        students.add(st);

        ArrayList<Course> courses2 = new ArrayList<>();
        Course course2 = new Course();
        course2.setDescription("cyber");
        course2.setGrade(73.6);
        course2.setName("Cyber Security");
        courses2.add(course2);

        course2 = new Course();
        course2.setName("english");
        course2.setGrade(70.6);
        course2.setDescription("English as second Language");
        courses.add(course2);

        course2 = new Course();
        course2.setName("Public Speaking");
        course2.setDescription("PS");
        course2.setGrade(85.65);
        courses.add(course2);

        st = new Student();
        st.setName("Candy");
        st.setCourses(courses2);
        students.add(st);

        ArrayList<Course> courses3 = new ArrayList<>();
        Course course3 = new Course();
        course3.setName("Java");
        course3.setDescription("Java Boot Camp");
        course3.setGrade(85.5);
        courses3.add(course3);

        course3 = new Course();
        course3.setName("Network");
        course3.setGrade(87.00);
        course3.setDescription("Network");
        courses3.add(course3);

        course3 = new Course();
        course3.setName("Data Analytics");
        course3.setDescription("Data");
        course3.setGrade(95.00);
        courses3.add(course3);

        st = new Student();
        st.setName("Mina");
        st.setCourses(courses3);
        students.add(st);





       /* Student joe = new Student("Joe", new ArrayList<>(Arrays.asList(new Course("data analytics", "learn data", 90.5),
                new Course("Algebra", "basic math", 89.2), new Course("public speaking", "talk!", 54.2))));

        Student adam = new Student("Adam", new ArrayList<>(Arrays.asList(new Course("data analytics", "learn data", 85.0),
                new Course("Public Speaking", "talk!", 78.9))));

        Student josie = new Student("Josie", new ArrayList<>(Arrays.asList(new Course("java bootcamp", "learn java", 100.0),
                new Course("Basket Weaving", "weave stuff! prepare for the apocalypse!", 100.0))));
*/
        //Collections.addAll(students, joe, adam, josie);

        for (Student s : students) {
            System.out.println(s.displayText());
        }


    }

}
