package PrinciplesAndStrategiesOfDesign.OpenClosedPrinciple;

public class Rectangle implements shape {
    double length;
    double width;

    @Override
    public double area() {
        return length * width;
    }
}
