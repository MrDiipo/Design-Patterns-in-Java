package PrinciplesAndStrategiesOfDesign.LiskovSubstitutionPrinciple;

public class Bus extends Vehicle{
    @Override
    int getSpeed() {
        return 0;
    }

    @Override
    int getCubicCapacity() {
        return 0;
    }
    String getEmergencyLock(){
        return null;
    }
}
