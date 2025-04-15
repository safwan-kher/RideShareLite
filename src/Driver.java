/****************************************************
 * Driver.java 
 * Author: Ochwada
 * Date: Tuesday, 15.Apr.2025, 14:35 hrs
 * @description:
 * @Objective:
 ***************************************************/

public class Driver {

    ///  Non Static Fields
    private String name;
    private String driverId;
    private String vehicleType;
    private int rating;

    ///  -- Static Field
    private static int driverCount = 1;

    // Static Method
    private static String generateDriverId(){
        return "GER B"+  driverCount++;
    }

    ///  Constructor
    // No-arg Constructor
    private Driver() {
    }

    // Parameterized
    private Driver(String vehicleType, String name) {
        this.vehicleType = vehicleType;
        this.name = name;
        this.driverId = generateDriverId();
        this.rating = 0;
    }

    ///  Static Factory Method
    // Register new Driver
    public static Driver register(String vehicleType, String name) {
        return new Driver(vehicleType, name);
    }

    ///  Getters

    public String getVehicleType() {
        return vehicleType;
    }

    public String getName() {
        return name;
    }
}
