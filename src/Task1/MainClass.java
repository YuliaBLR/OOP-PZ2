package Task1;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Barsik", 7);
        Cat cat2 = new Cat("Tom", 10);
        Cat cat3 = new Cat("Bulochka", 2);
        Cat cat4 = new Cat("Murzik", 25);
        Cat cat5 = new Cat("Matroskin", 6);
        Plate plate = new Plate(42);
        plate.info();

        plate.addFood(10);
        plate.info();

        ArrayList<Cat> catlist = new ArrayList<>();
        catlist.add(cat1);
        catlist.add(cat2);
        catlist.add(cat3);
        catlist.add(cat4);
        catlist.add(cat5);

        for (Cat c: catlist) {
            if (c.getAppetite() <= plate.getFood()){
                plate.setFood(plate.getFood() - c.getAppetite());
                System.out.printf("Котик %s съел %d единиц еды и сыт\nВ тарелке осталось еды: %d\n", c.getName(), c.getAppetite(),plate.getFood());
                c.setSatiety(true);
                c.setAppetite(0);
            } else{
                System.out.printf("Котику %s не хватило %d единиц еды и он голоден\nВ тарелке осталось еды: %d\n", c.getName(), (c.getAppetite()-plate.getFood()) ,plate.getFood());
            }

        }

    }

}