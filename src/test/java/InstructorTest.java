import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructorTest {
    Instructor instructor;
    Student student;
    @BeforeEach
    public void beforeEach(){
        instructor = new Instructor(110L,"Anderson");
        student = new Student(9090L, "Bobby");
    }

    @Test
    public void testImplementation(){
        //Given
        //Then
        //When
        Assert.assertTrue(instructor instanceof Teacher);
    }
    @Test
    public void testInheritance(){
        //Given
        //Then
        //When
        Assert.assertTrue(instructor instanceof Person);
    }
    @Test
    public void testTeach(){
        //Given
        Double expected = 20.0;
        instructor.teach(student, 20.0);
        //Then
        Double actual = student.getTotalStudyTime();
        //When
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testLecture(){
        //Given
        Student student1 = new Student(2020L,"Michael");
        Student[] students ={student, student1};
        instructor.lecture(students,10);
        Double expected = 5.0;
        //Then
        Double actual = student.getTotalStudyTime();
        //When
        Assertions.assertEquals(expected, actual);
    }

}