public class Trip {
    private String tripId;
    private Driver driver;
    private Rider rider;
    private double distance;
    private double fare;

    //Constructors
    private Trip(){};

    private Trip(String tripId, Driver driver, Rider rider, double distance, double fare) {
        this.tripId = tripId;
        this.driver = driver;
        this.rider = rider;
        this.distance = distance;
        this.fare = fare;
    }

    private Trip(Driver driver, Rider rider, double distance) {
        this.driver = driver;
        this.rider = rider;
        this.distance = distance;
        this.fare = calculateFare(distance);
    }

    //Static factory method
    public static Trip bookTrip(Driver driver, Rider rider, double distance) {
           return new Trip(driver, rider, distance);
    }

    //Calculate fare method
    public static double calculateFare(double distance) {
        return distance * 2.5; //2.5 euro per km
    }

    //Getters
    public String getTripId() {
        return tripId;
    }

    public Driver getDriver() {
        return driver;
    }

    public Rider getRider() {
        return rider;
    }

    public double getDistance() {
        return distance;
    }

    public double getFare() {
        return fare;
    }
}

