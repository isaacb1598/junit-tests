import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StudentTest {

    @Test
    public void testStudentConstructor() {
        Student student = new Student("Bob Jak", 123);
        assertEquals("Bob Jak", student.getName());
        assertEquals(123, student.getId());
        assertTrue(student.getGrades().isEmpty());
    }
    @Test
    public void testAddGrade() {
        Student student = new Student("Bob Jak", 123);
        student.addGrade(90);
        assertEquals(1, student.getGrades().size());
        assertEquals(90, student.getGrades().get(0),0.01);
    }
    @Test
    public void testGetGradeAverage() {
        Student student = new Student("Bob Jak", 123);
        student.addGrade(90);
        student.addGrade(80);
        student.addGrade(70);
        assertEquals(80.0, student.getGradeAverage(),0.01);
    }
}

