public class Car extends Vehicle implements Drivable{
    private int doors;


    public Car(String brand, int year, int doors) {
        super(brand, year);
        this.doors = doors;
    }

    @Override
    public void drive() {
        System.out.println("auto jedzie");
    }

    @Override
    public void stop() {
        System.out.println("auto stoi");
    }

    @Override
    public void turn() {
        System.out.println("auto skreca");
    }

    @Override
    public void displayInfo() {
        System.out.println("Samochód; Marka: " + brand +", Rok: "+year +", Doors: "+doors);
    }
}
