import java.util.ArrayList;

public class zoo {

    public static void main(String[] args) {
        zoo z = new zoo();
        z.sleep("Tigger");
        z.eat("Tigger", "bacon");
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");
        Unicorn rarity = new Unicorn("Rarity");
        rarity.eat("marshmallows");
        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("meat");
        gemma.eat("leaves");
        Bee stinger = new Bee("Stinger");
        stinger.eat("ice cream");
        stinger.eat("pollen");
        Zookeeper zoey = new Zookeeper("Zoey");

//        Bee x = new Bee("St");
//        Bee v = new Bee("inger");
//        Bee q = new Bee("Stier");



        ArrayList<Animal> animals = new ArrayList<Animal>();


        animals.add(tigger);
        animals.add(pooh);
        animals.add(rarity);
        animals.add(gemma);
        animals.add(stinger);

        zoey.feedAnimals(animals, "Mushrooms");



    }

    public void sleep(String name) {
        System.out.println(name + " sleeps for 8 hours");
    }

    String favoriteFood = "bacon";


    public void eat(String name, String food) {
        System.out.println(name + " eats " + food);
        if (food.equals(favoriteFood)) {
            System.out.println("YUM!!! " + name + " wants more " + food);
        } else {
            sleep(name);
        }
    }

}
