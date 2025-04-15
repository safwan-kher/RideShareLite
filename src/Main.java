public class Main {

    public static void main(String[] args) {
        Driver driver = Driver.register("Car", "John");
        Rider rider = Rider.createRider("Kate", "Berlin");
        Trip trip = Trip.bookTrip(driver, rider, 500.60);

        System.out.println("Yon need to transfer: " + trip.getFare()+" €");
    }
}
