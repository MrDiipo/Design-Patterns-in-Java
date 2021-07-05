package PrinciplesAndStrategiesOfDesign.ProgrammingToAnInterface;

public class Projector implements displayModule{
    @Override
    public void display() {
        System.out.println("Display through projector");
    }
}
