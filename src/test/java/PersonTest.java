import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person;

    @BeforeEach
    public void beforeEach(){
        person = new Person(111L,"Sammy");
    }

    @Test
    public void testConstructor(){
        //Given
        String expectedName = "";
        long expectedId = 181L;
        //When
        person.setName(expectedName);
        String actualName = person.getName();
        long actualId = 181L;
        //Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedId, actualId);
    }
    @Test
    public void nameTest(){
        //Given
        String expected = "Durran";
        //When
        person.setName(expected);
        String actual = person.getName();
        //Then
        Assert.assertEquals(expected, actual);
    }

}