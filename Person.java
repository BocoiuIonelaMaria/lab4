public class Person {
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

public class Student extends Person {
    private int[] grades;

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }
}
public class Professor extends Person {
    private String[] courses;
    public String[] getCourses() {
        return courses;
    }
    public void setCourses(String[] courses) {
        this.courses = courses;
    }
}
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John");
        student.setEmail("john@example.com");
        student.setGrades(new int[] {90, 85, 92});

        Professor professor = new Professor();
        professor.setName("Dr. Smith");
        professor.setEmail("smith@example.com");
        professor.setCourses(new String[] {"Math", "Physics"});

        // Afișarea informațiilor despre student și profesor
        System.out.println("Student: " + student.getName() + " - " + student.getEmail());
        System.out.println("Student Grades: " + Arrays.toString(student.getGrades()));

        System.out.println("Professor: " + professor.getName() + " - " + professor.getEmail());
        System.out.println("Courses Taught: " + Arrays.toString(professor.getCourses()));
    }
}
