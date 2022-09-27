public class Student {

    private static final String name = "Alex";
    private static final int course = 3;

    public Student(String name, int course) {
        name = "Alex";
        course = 3;

    }

    @Override
    public String toString() {
        return "Класс Student" + name + course;

    }

    public static String getName() {
        return name;
    }

    public static int getCourse() {
        return course;
    }
}
