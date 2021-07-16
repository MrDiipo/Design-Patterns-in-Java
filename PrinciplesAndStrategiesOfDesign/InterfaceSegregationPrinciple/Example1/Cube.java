package PrinciplesAndStrategiesOfDesign.InterfaceSegregationPrinciple.Example1;

public class Cube implements ShapesInterface, SolidShapeInterface, ManageShapeInterface{
    @Override
    public double area(){
        return 1.0;
    }
    @Override
    public double volume(){
        return 1.0;
    }
    @Override
    public  double calculate(){
        return this.area() + this.volume();
    }
}
