package PrinciplesAndStrategiesOfDesign.LiskovSubstitutionPrinciple;

public class Client {
    public static void main(String... args){
        Vehicle vehicle = new Bus();
        vehicle.getSpeed();
        vehicle = new Car();
        vehicle.getCubicCapacity();
    }
}
