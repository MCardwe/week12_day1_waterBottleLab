public class WaterBottle {

    private int volume;

    public WaterBottle() {
        this.volume = 100;
    }

    public int getVolume() {
        return this.volume;
    }

    public void drink() {
        this.volume -= 10;
    }

    public void emptyDrink() {
        this.volume -= this.volume;
    }

    public void fillDrink() {
        this.volume = 100;
    }
}
