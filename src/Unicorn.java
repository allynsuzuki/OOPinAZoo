/**
 * Created by h205p3 on 4/17/18.
 */
public class Unicorn extends Animal {
    String name;
    String favoriteFood;

    public Unicorn(String name) {
        super(name, "marshmallows");
        this.name = name;
        favoriteFood = "marshmallows";

    }
    public void sleep(String name) {
        System.out.println(name + " sleeps in a cloud.");
    }


}
