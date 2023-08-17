package school_registrar;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    private static Course a;
    @BeforeEach
    public void setupBeforeEach()
    {
        String courseName = "HIST 213";
        int regisCode = 302;
        a = new Course(courseName, regisCode);
    }

    @Test
    void search() throws StudentException, CourseException {
        Student target = new Student("student2", 2);
        a.addStudent(target);

        boolean found = a.search(target.getStudentId());
        assertTrue(found);
    }

    @Test
    void addStudentThrowsAnExactlyCourseException() {
        Exception exception = assertThrows(CourseException.class, () -> {
            int i;
            for (i = 0; i < 35; i++) {
                a.addStudent(new Student("student" + (i + 1), (i + 1)));
            }
            a.addStudent(new Student("student" + (i + 1), (i + 1)));
        });

        String expectedMessage = "HIST 213 is full.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void addStudentThrowsAnExactlyStudentException() {
        Exception exception = assertThrows(StudentException.class, () -> {
            a.addStudent(new Student("student" + 12, 12));
            a.addStudent(new Student("student" + 12, 12));
        });

        String expectedMessage = "student12 is in the course.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void removeStudentThrowsExactlyCourseException() {
        Exception exception = assertThrows(CourseException.class, () -> {
            a.removeStudent(new Student("student" + 12, 12));
        });

        String expectedMessage = "HIST 213 has no students.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void removeStudentThrowsExactlyStudentException() {
        Exception exception = assertThrows(StudentException.class, () -> {
            a.addStudent(new Student("student" + 12, 12));
            a.removeStudent(new Student("student" + 1, 1));
        });

        String expectedMessage = "student1 is not in the course.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @AfterEach
    public void setupAfterEach()
    {
        a = null;
    }
}