public class Plane extends Vehicle implements Drivable{
    private int altitude;


    public Plane(String brand, int year, int altitude) {
        super(brand, year);
        this.altitude = altitude;
    }

    @Override
    public void drive() {
        System.out.println("Samolot startuje");
    }

    @Override
    public void stop() {
        System.out.println("Samolot ląduje");
    }

    @Override
    public void turn() {
        System.out.println("Samolot skręca");
    }

    @Override
    public void displayInfo() {
        System.out.println("Samolot, producent: "+brand+", rok: "+ year+", wysokość osiągalna: "+ altitude+" metrów");
    }
}
