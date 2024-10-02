package Plants;

public class Cactus extends Plant{

    public Cactus(String PLANT_TYPE, String NAME, double height) {
        super(PLANT_TYPE, NAME, height);
    }

    @Override
    public double consumption() {
        return 0.02;
    }

    @Override
    public String toString() {
        return "Cactus{" +
                "CONSUMPTION=" +
                '}' + super.toString();
    }
}
