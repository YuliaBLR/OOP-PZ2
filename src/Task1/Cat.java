package Task1;

public class Cat {

    private String name;

    private int appetite;

    private boolean satiety; // сытость

    public boolean getSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    public void eat(){


    }
}
