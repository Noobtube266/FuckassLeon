import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student;
    @BeforeEach
    public void beforeEach(){
        student = new Student(200L,"Marcus");
    }

    @Test
    public void testImplementation(){
    //Given
    //When
    //Then
        Assert.assertTrue(student instanceof Learner);
    }
    @Test
    public void testInheritance(){
        //Given
        //When
        //Then
        Assert.assertTrue(student instanceof Person);
    }
    @Test
    public void testLearn(){
        //Given
        Double expected = 8.0;
        student.learn(8.0);
        //When
        Double actual = student.getTotalStudyTime();
        //Then
        Assert.assertEquals(expected, actual);
    }

}