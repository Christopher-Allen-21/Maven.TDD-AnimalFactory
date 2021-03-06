package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`


    @Test
    public void catAddTest(){
        String catName1 = "Garfield";
        Date catDate1 = new Date();
        int catId1 = 1;
        Cat cat1 = new Cat(catName1,catDate1,catId1);

        String catName2 = "James";
        Date catDate2 = new Date();
        int catId2 = 2;
        Cat cat2 = new Cat(catName2,catDate2,catId2);

        CatHouse.add(cat1);
        CatHouse.add(cat2);

        Assert.assertEquals(cat2,CatHouse.getCatById(catId2));

    }

    @Test
    public void removeCatTest(){
        String catName3 = "Garfield";
        Date catDate3 = new Date();
        int catId3 = 3;
        Cat cat3 = new Cat(catName3,catDate3,catId3);

        String catName4 = "James";
        Date catDate4 = new Date();
        int catId4 = 4;
        Cat cat4 = new Cat(catName4,catDate4,catId4);

        CatHouse.add(cat3);
        CatHouse.add(cat4);

        CatHouse.remove(cat3);

        Cat expectedCat = null;

        Assert.assertEquals(expectedCat,CatHouse.getCatById(catId3));
    }

    @Test
    public void removeIdTest(){
        String catName5 = "Garfield";
        Date catDate5 = new Date();
        int catId5 = 5;
        Cat cat5 = new Cat(catName5,catDate5,catId5);

        String catName6 = "James";
        Date catDate6 = new Date();
        int catId6 = 6;
        Cat cat6 = new Cat(catName6,catDate6,catId6);

        CatHouse.add(cat5);
        CatHouse.add(cat6);

        CatHouse.remove(catId6);

        Cat expectedCat = null;
        Cat actualCat = CatHouse.getCatById(catId6);

        Assert.assertEquals(expectedCat,actualCat);
    }

    @Test
    public void catIdTest(){
        String catName7 = "Garfield";
        Date catDate7 = new Date();
        int catId7 = 7;
        Cat cat7 = new Cat(catName7,catDate7,catId7);

        String catName8 = "James";
        Date catDate8 = new Date();
        int catId8 = 8;
        Cat cat8 = new Cat(catName8,catDate8,catId8);

        CatHouse.add(cat7);
        CatHouse.add(cat8);

        Assert.assertEquals(cat7,CatHouse.getCatById(catId7));
    }

    @Test
    public void numberOfCatsTest(){
        String catName9 = "Garfield";
        Date catDate9 = new Date();
        int catId9 = 9;
        Cat cat9 = new Cat(catName9,catDate9,catId9);

        String catName10 = "James";
        Date catDate10 = new Date();
        int catId10 = 10;
        Cat cat10 = new Cat(catName10,catDate10,catId10);

        CatHouse.add(cat9);
        CatHouse.add(cat10);

        Integer expectedNumOfCats = 8;
        Integer actualNumOfCats = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedNumOfCats,actualNumOfCats);
    }
}
