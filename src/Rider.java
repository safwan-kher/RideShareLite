public class Rider {

    private String name;
    private String riderId;
    private String location;

    static int riderCount = 1;

    private Rider() {
    }

    private Rider(String name, String location) {
        this.name = name;
        this.location = location;
        this.riderId = generateRiderId();
    }

    private String generateRiderId() {
        return "RD" + riderCount++;
    }

    public static Rider createRider(String name, String location){
        return new Rider(name, location);
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}
