package PrinciplesAndStrategiesOfDesign.InterfaceSegregationPrinciple.Example1;

public class square implements ShapesInterface, ManageShapeInterface{
    @Override
    public double area(){
        return 1.0;
    }
    @Override
    public double calculate(){
        return this.area();
    }

}
