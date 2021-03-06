package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    private String dogGivenName = "Milo";
    private Date dogGivenBirthDate = new Date();
    private int dogGivenId = 0;

    private String catGivenName = "Garfield";
    private Date catGivenBirthDate = new Date();
    private int catGivenId = 1;


    @Test
    public void createDogTest(){
        Dog dog1 = new Dog(dogGivenName,dogGivenBirthDate,dogGivenId);

        String expectedName = dog1.getName();
        Date expectedBirthDate = dog1.getBirthDate();
        int expectedId = dog1.getId();

        Assert.assertEquals(expectedName, dogGivenName);
        Assert.assertEquals(expectedBirthDate, dogGivenBirthDate);
        Assert.assertEquals(expectedId, dogGivenId);
    }

    @Test
    public void createCatTest(){
        Cat cat1 = new Cat(catGivenName,catGivenBirthDate,catGivenId);

        String expectedName = cat1.getName();
        Date expectedBirthDate = cat1.getBirthDate();
        int expectedId = cat1.getId();

        Assert.assertEquals(expectedName, catGivenName);
        Assert.assertEquals(expectedBirthDate, catGivenBirthDate);
        Assert.assertEquals(expectedId, catGivenId);
    }
}
