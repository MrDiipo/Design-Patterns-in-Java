package PrinciplesAndStrategiesOfDesign.LiskovSubstitutionPrinciple;

public class Car extends Vehicle {
    int getSpeed(){
        return 0;
    }

    @Override
    int getCubicCapacity() {
        return 0;
    }
    boolean sHatchBack(){
        return true;
    }
}
