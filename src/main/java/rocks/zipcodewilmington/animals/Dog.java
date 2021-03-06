package rocks.zipcodewilmington.animals;

import rocks.zipcodewilmington.Food;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class Dog extends Mammal {
    private int numberOfMealEaten = 0;

    public Dog(String name, Date birthDate, Integer id) {
        super(name, birthDate, id);
    }

    public String speak() {
        return "bark!";
    }

    public void eat(Food food){
        this.numberOfMealEaten++;
    }

    public int getNumberOfMealEaten(){
        return this.numberOfMealEaten;
    }

}
