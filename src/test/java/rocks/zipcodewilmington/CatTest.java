package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

    @Test
    public void constructorTest() {

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest(){

        Cat cat1 = new Cat(givenName, givenBirthDate, givenId);

        cat1.setName("Garfield");
        String expected = "Garfield";
        String actual = cat1.getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setBirthDate(){

        Cat cat1 = new Cat(givenName, givenBirthDate, givenId);

        Date newBirthDate = new Date(2012,3,22);
        cat1.setBirthDate(newBirthDate);
        Date expected = newBirthDate;
        Date actual = cat1.getBirthDate();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void speakTest(){

        Cat cat1 = new Cat(givenName, givenBirthDate, givenId);

        String expected = "meow!";
        String actual = cat1.speak();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void eatTest(){

        Cat cat1 = new Cat(givenName, givenBirthDate, givenId);
        Food food1 = new Food("Cat food");

        Integer expected = 2;
        cat1.eat(food1);
        cat1.eat(food1);
        Integer actual = cat1.getNumberOfMealEaten();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getIdTest(){

        Cat cat1 = new Cat(givenName, givenBirthDate, givenId);

        Integer expected = 0;
        Integer actual = cat1.getId();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void checkAnimalInheritance(){

        Cat cat1 = new Cat(givenName, givenBirthDate, givenId);

        boolean expected = true;
        boolean actual;

        if(cat1 instanceof Animal){
            actual = true;
        }
        else{
            actual = false;
        }

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void checkMammalInheritance(){

        Cat cat1 = new Cat(givenName, givenBirthDate, givenId);

        boolean expected = true;
        boolean actual;

        if(cat1 instanceof Mammal){
            actual = true;
        }
        else{
            actual = false;
        }

        Assert.assertEquals(expected,actual);
    }

}
