import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> pojazdy = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Wybierz co chcesz zrobic:");
            System.out.println("1. Wyświetl całą liste");
            System.out.println("2. Wyszukaj pojazd z listy");
            System.out.println("3. Dodaj nowy pojazd na liste");
            System.out.println("4. Usuń pojazd z listy");
            System.out.println("5. Wyjdź");
            int opcja = scan.nextInt();
            scan.nextLine();

            switch (opcja) {
                case 1:
                    if (!pojazdy.isEmpty()) {
                        System.out.println("Lista pojazdów: \n");
                        for (Vehicle x : pojazdy) {
                            x.displayInfo();
                        }
                        System.out.println();
                    } else {
                        System.out.println("Lista jest pusta, proszę dodać pojazd.");
                    }
                    break;
                case 2:
                    if (!pojazdy.isEmpty()) {
                        System.out.println("Wybierz jakiego rodzaju pojazdy chcesz wyświetlić: Car, Plane, Bike, Boat");
                        String rodzaj = scan.nextLine();
                        for (Vehicle x : pojazdy) {
                            if (rodzaj.equalsIgnoreCase("Car") && x instanceof Car) {
                                x.displayInfo();
                            } else if (rodzaj.equalsIgnoreCase("Bike") && x instanceof Bike) {
                                x.displayInfo();
                            } else if (rodzaj.equalsIgnoreCase("Plane") && x instanceof Plane) {
                                x.displayInfo();
                            } else if (rodzaj.equalsIgnoreCase("Boat") && x instanceof Boat) {
                                x.displayInfo();
                            }
                        }
                    } else {
                        System.out.println("Lista jest pusta, proszę dodać pojazd.");
                    }
                    break;
                case 3:
                    System.out.println("Wprowadz typ pojazdu który chcesz dodać: Car, Plane, Bike, Boat");
                    String typ = scan.nextLine();
                    System.out.println("Wprowadz producenta: ");
                    String marka = scan.nextLine();
                    System.out.println("Wprowadz rok produkcji: ");
                    int rok = scan.nextInt();

                    if (typ.equalsIgnoreCase("Car")) {
                        System.out.println("Podaj ilość drzwi:");
                        int doors = scan.nextInt();
                        pojazdy.add(new Car(marka, rok, doors));
                    } else if (typ.equalsIgnoreCase("Bike")) {
                        System.out.println("Czy ma dzwonek? (true/false):");
                        boolean bell = scan.nextBoolean();
                        pojazdy.add(new Bike(marka, rok, bell));
                    } else if (typ.equalsIgnoreCase("Plane")) {
                        System.out.println("Wprowadz osiągalną wysokość:");
                        int altitude = scan.nextInt();
                        pojazdy.add(new Plane(marka, rok, altitude));
                    } else if (typ.equalsIgnoreCase("Boat")) {
                        System.out.println("Wprowadz długość kadłubu:");
                        double length = scan.nextDouble();
                        pojazdy.add(new Boat(marka, rok, length));
                    } else {
                        System.out.println("Niepoprawny typ.");
                    }
                    scan.nextLine();
                    break;
                case 4:
                    if (!pojazdy.isEmpty()) {
                        System.out.println("Wprowadz pozycję na liście pojazdu, który chcesz usunąć:");
                        for (int i = 0; i < pojazdy.size(); i++) {
                            System.out.print(i + ": ");
                            pojazdy.get(i).displayInfo();
                        }
                        int index = scan.nextInt();
                        if (index >= 0 && index < pojazdy.size()) {
                            pojazdy.remove(index);
                            System.out.println("Pojazd został usunięty.");
                        } else {
                            System.out.println("Zły numer pojazdu.");
                        }
                        scan.nextLine();
                    } else {
                        System.out.println("Lista jest pusta, nie ma czego usuwać.");
                    }
                    break;
                case 5:
                    System.out.println("Opuszczasz program.");
                    scan.close();
                    return;
                default:
                    System.out.println("Zły numer opcji.");
            }
        }
    }
}
