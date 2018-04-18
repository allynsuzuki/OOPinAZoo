/**
 * Created by h205p3 on 4/17/18.
 */
public class Bear extends Animal {
    String name;

    String favoriteFood;
    public Bear(String name) {
        super(name, "fish");
        this.name = name;
        favoriteFood = "fish";

    }
    public void sleep(String name) {
        System.out.println(name + " hibernates for 4 months.");
    }

}
