import java.util.Random;

public class Ship {
    Random r = new Random();

    String name;
    int weight;
    int x;
    int y;

    public Ship(String name, int weight, int x, int y) {
        this.name = name;
        this.weight = weight;
        this.x = x;
        this.y = y;
    }

    public Ship() {
        this("Nameless", 0, 0, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void shipPrint() {
        System.out.println("Корабль: " + name);
        System.out.println("Водоизмещение: " + weight);
        System.out.println("Координаты: x - " + x + " y - " + y);
    }

    public void moveTo(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    public void moveRandom() {
        x = r.nextInt(50);
        y = r.nextInt(50);
    }

}
