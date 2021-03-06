package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void dogAddTest(){
        String dogName1 = "Scooby";
        Date dogDate1 = new Date();
        int dogId1 = 1;
        Dog dog1 = new Dog(dogName1,dogDate1,dogId1);

        String dogName2 = "Air Bud";
        Date dogDate2 = new Date();
        int dogId2 = 2;
        Dog dog2 = new Dog(dogName2,dogDate2,dogId2);

        DogHouse.add(dog1);
        DogHouse.add(dog2);

        Assert.assertEquals(dog1,DogHouse.getDogById(dogId1));

    }

    @Test
    public void removeDogTest(){
        String dogName3 = "Scooby";
        Date dogDate3 = new Date();
        int dogId3 = 3;
        Dog dog3 = new Dog(dogName3,dogDate3,dogId3);

        String dogName4 = "Air Bud";
        Date dogDate4 = new Date();
        int dogId4 = 4;
        Dog dog4 = new Dog(dogName4,dogDate4,dogId4);

        DogHouse.add(dog3);
        DogHouse.add(dog4);

        DogHouse.remove(dog3);

        Dog expectedDog = null;

        Assert.assertEquals(expectedDog,DogHouse.getDogById(dogId3));
    }

    @Test
    public void removeIdTest(){
        String dogName5 = "Scooby";
        Date dogDate5 = new Date();
        int dogId5 = 5;
        Dog dog5 = new Dog(dogName5,dogDate5,dogId5);

        String dogName6 = "Air Bud";
        Date dogDate6 = new Date();
        int dogId6 = 6;
        Dog dog6 = new Dog(dogName6,dogDate6,dogId6);

        DogHouse.add(dog5);
        DogHouse.add(dog6);

        DogHouse.remove(dog5);

        Dog expectedDog = null;
        Dog actualDog = DogHouse.getDogById(dogId5);

        Assert.assertEquals(expectedDog,actualDog);
    }

    @Test
    public void dogIdTest(){
        String dogName7 = "Scooby";
        Date dogDate7 = new Date();
        int dogId7 = 7;
        Dog dog7 = new Dog(dogName7,dogDate7,dogId7);

        String dogName8 = "Air Bud";
        Date dogDate8 = new Date();
        int dogId8 = 8;
        Dog dog8 = new Dog(dogName8,dogDate8,dogId8);

        DogHouse.add(dog7);
        DogHouse.add(dog8);

        Assert.assertEquals(dog7,DogHouse.getDogById(dogId7));
    }

    @Test
    public void numberOfDogsTest(){
        String dogName9 = "Scooby";
        Date dogDate9 = new Date();
        int dogId9 = 9;
        Dog dog9= new Dog(dogName9,dogDate9,dogId9);

        String dogName10 = "Air Bud";
        Date dogDate10 = new Date();
        int dogId10 = 10;
        Dog dog10 = new Dog(dogName10,dogDate10,dogId10);

        DogHouse.add(dog9);
        DogHouse.add(dog10);

        Integer expectedNumOfDogs = 8;
        Integer actualNumOfDogs = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expectedNumOfDogs,actualNumOfDogs);
    }
}
