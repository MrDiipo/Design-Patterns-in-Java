package PrinciplesAndStrategiesOfDesign.OpenClosedPrinciple;

public class Circle implements shape {
    double radius;

    @Override
    public double area() {
        return (22/7) * (radius * radius);
    }
}
