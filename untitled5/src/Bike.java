public class Bike extends Vehicle implements Drivable{
    private boolean hasBell;

    public Bike(String brand, int year, boolean hasBell) {
        super(brand, year);
        this.hasBell = hasBell;
    }

    @Override
    public void drive() {
        System.out.println("rower jedzie");
    }

    @Override
    public void stop() {
        System.out.println("rower stoi");
    }

    @Override
    public void turn() {
        System.out.println("rower sie obraca");
    }

    @Override
    public void displayInfo() {
        System.out.println("Rower; marka: "+ brand+", rok: "+ year+", ma dzwonek: "+ hasBell);
    }
}
