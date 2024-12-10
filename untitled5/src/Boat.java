public class Boat extends Vehicle implements Drivable{
    private  double length;

    public Boat(String brand, int year, double length) {
        super(brand, year);
        this.length = length;
    }

    @Override
    public void drive() {
        System.out.println("Łódź płynie");
    }

    @Override
    public void stop() {
        System.out.println("Łódź jest zacumowana");
    }

    @Override
    public void turn() {
        System.out.println("Łódź skręca");
    }

    @Override
    public void displayInfo() {
        System.out.println("Łódź; producent: "+ brand+", rok: "+year+", długosc kadłubu: "+ length);
    }
}
