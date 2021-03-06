package rocks.zipcodewilmington;

/**
 * @author leon on 4/19/18.
 */
public class Food {
    private String foodName;

    public Food(String foodName){
        this.foodName = foodName;
    }

    public void setFoodName(String foodName){
        this.foodName = foodName;
    }

    public String getFoodName(){
        return this.foodName;
    }
}
