/**
 * Created by h205p3 on 4/17/18.
 */
public class Bee extends Animal {
    String name;

    String favoriteFood;

    public Bee(String name) {
        super(name, "pollen");
        this.name = name;
        favoriteFood = "pollen";

    }
    public void sleep(String name) {
        System.out.println(name + " never sleeps");
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
