package ProgrammingToAnInterface;

public interface displayModule {
    public void display();
}

class Monitor implements displayModule {
    @java.lang.Override
    public void display() {
        System.out.println("Display through Monitor");
    }
}

class Projector implements displayModule{
    @Override
    public void display() {
        System.out.println("Display through projector");
    }
}
