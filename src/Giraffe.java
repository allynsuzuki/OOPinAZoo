/**
 * Created by h205p3 on 4/17/18.
 */
public class Giraffe extends Animal{
    String name;
    String favoriteFood;

    public Giraffe(String name) {
        super(name, "leaves");
        this.name = name;
        favoriteFood = "leaves";

    }

    public void eat(String food) {
        if (food.equals(favoriteFood)) {
            System.out.println(name + " eats " + food);
            System.out.println("YUM!!! " + name + " wants more " + food);
            sleep(name);
        } else {
            System.out.println("YUCK!!! " + name + " will not eat "+ food);
        }

    }
}
