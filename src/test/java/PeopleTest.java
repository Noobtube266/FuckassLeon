import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PeopleTest {

    People people;
    @BeforeEach
    public void beforeEach(){
        people = new People();
    }
    @Test
    public void testAdd(){
        //Given
        int expected = 1;
        //When
        people.add(new Person(5987L,"Jazmin"));
        //Then
        Assertions.assertEquals(expected, people.ArraylistSize());
    }
    @Test
    public void testRemove(){
        //Given
        int expected = 0;
        Person person1 = new Person(6363L,"Rodriguez");
        //When
        people.add(person1);
        people.remove(person1);
        //Then
        Assertions.assertEquals(expected, people.ArraylistSize());
    }
    @Test
    public void testFindById(){
        //Given
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(74747L,"Rebecca"));
        people.setPersonList(personList);
        Person expected = personList.get(0);
        //When
        Person actual = people.findById(74747L);
        //Then
        Assertions.assertEquals(expected, actual);
    }

}