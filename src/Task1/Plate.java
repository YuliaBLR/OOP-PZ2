package Task1;

public class Plate {

    private int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if (food >= 0) {
            this.food = food;
        }
    }

    public Plate(int food) {
        this.food = food;
    }

    public void info(){
        System.out.println("plate: " + food);
    }

    // Метод для добавления еды в тарелку
    public void addFood(int amount){
        this.food += amount;
    }
}
