import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        Student joe = new Student("Joe", new ArrayList<>(Arrays.asList(new Course("data analytics", "learn data", 90.5),
                new Course("Algebra", "basic math", 89.2), new Course("public speaking", "talk!", 54.2))));

        Student adam = new Student("Adam", new ArrayList<>(Arrays.asList(new Course("data analytics", "learn data", 85.0),
                new Course("Public Speaking", "talk!", 78.9))));

        Student josie = new Student("Josie", new ArrayList<>(Arrays.asList(new Course("java bootcamp", "learn java", 100.0),
                new Course("Basket Weaving", "weave stuff! prepare for the apocalypse!", 100.0))));

        Collections.addAll(students, joe, adam, josie);

        for (Student s : students) {
            System.out.println(s.displayText());
        }


    }

}
