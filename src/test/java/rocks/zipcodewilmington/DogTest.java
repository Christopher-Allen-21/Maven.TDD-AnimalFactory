package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    private String givenName = "Milo";
    private Date givenBirthDate = new Date();
    private int givenId = 0;

    @Test
    public void constructorTest(){
        Dog dog1 = new Dog(givenName,givenBirthDate,givenId);

        String expectedName = dog1.getName();
        Date expectedBirthDate = dog1.getBirthDate();
        int expectedId = dog1.getId();

        Assert.assertEquals(expectedName, givenName);
        Assert.assertEquals(expectedBirthDate, givenBirthDate);
        Assert.assertEquals(expectedId, givenId);
    }



    @Test
    public void setNameTest(){

        Dog dog1 = new Dog(givenName,givenBirthDate,givenId);

        dog1.setName("Ace");
        String expected = "Ace";
        String actual = dog1.getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setBirthDate(){

        Dog dog1 = new Dog(givenName,givenBirthDate,givenId);

        Date newBirthDate = new Date(2012,3,22);
        dog1.setBirthDate(newBirthDate);
        Date expected = newBirthDate;
        Date actual = dog1.getBirthDate();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void speakTest(){

        Dog dog1 = new Dog(givenName,givenBirthDate,givenId);

        String expected = "bark!";
        String actual = dog1.speak();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void eatTest(){

        Dog dog1 = new Dog(givenName,givenBirthDate,givenId);
        Food food1 = new Food("Dog food");

        Integer expected = 1;
        dog1.eat(food1);
        Integer actual = dog1.getNumberOfMealEaten();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getIdTest(){

        Dog dog1 = new Dog(givenName,givenBirthDate,givenId);

        Integer expected = 0;
        Integer actual = dog1.getId();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void checkAnimalInheritance(){

        Dog dog1 = new Dog(givenName,givenBirthDate,givenId);

        boolean expected = true;
        boolean actual;

        if(dog1 instanceof Animal){
            actual = true;
        }
        else{
            actual = false;
        }

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void checkMammalInheritance(){

        Dog dog1 = new Dog(givenName,givenBirthDate,givenId);

        boolean expected = true;
        boolean actual;

        if(dog1 instanceof Mammal){
            actual = true;
        }
        else{
            actual = false;
        }

        Assert.assertEquals(expected,actual);
    }
}
