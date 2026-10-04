public class WarShip extends Ship {

    int guns;

    public WarShip(String name, int weight, int x, int y, int guns) {
        super(name, weight, x, y);
        this.guns = guns;
    }

    public WarShip() {
        super();
        this.guns = 0;
    }

    public int getGuns() {
        return guns;
    }

    public void setGuns(int guns) {
        this.guns = guns;
    }

    @Override
    public void shipPrint() {
        System.out.println("Корабль: " + name);
        System.out.println("Водоизмещение: " + weight);
        System.out.println("Координаты: x - " + x + " y - " + y);
        System.out.println("Количество орудий: " + guns);
    }

}
