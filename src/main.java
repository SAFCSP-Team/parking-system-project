public class Main {
    public static void main(String[] args) {
        ParkingSystem ps = new ParkingSystem();

        for (int i = 0; i < 10; i++) {
            ps.allocate(new Employee("Emp" + i, 1000 + i, "Car" + i));
        }

        System.out.println("\n--- all parked employees ---");
        ps.printAll();

        System.out.println("\n--- deallocate slot (0, 4) :) ---");
        ps.deallocate(0, 4);

        System.out.println("\n--- Reallocate last employee ---");
        ps.reallocate(0, 9, 1, 0);

        System.out.println("\n--- Updated Parking ---");
        ps.printAll();

        System.out.println("\nIs Parking Full? " + ps.isFull());
        System.out.println("Is Parking Empty? " + ps.isEmpty());
    }
}
