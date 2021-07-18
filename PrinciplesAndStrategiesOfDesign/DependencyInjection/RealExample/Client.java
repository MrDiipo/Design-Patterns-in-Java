package PrinciplesAndStrategiesOfDesign.DependencyInjection.RealExample;

public class Client {
    public  Service myService;
    // Injects via the constructor
    private Client(Service myService){
        this.myService = myService;
    }
    public void doSomething(){
        myService.write("This is a message");
    }
    public static void main(String... args){
        Service newService = new ServiceA(); // The injector
        Client newClient = new Client(newService); // Injects via the constructor
        newClient.doSomething();

    }
}
