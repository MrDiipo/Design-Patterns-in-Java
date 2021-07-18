package PrinciplesAndStrategiesOfDesign.DependencyInjection.HardDependency;

public class Client {
    // Internal reference to the service used by this client
    private ExampleService service;

    public Client(){
        // specify a specific implementation in the constructor instead
        service = new ExampleService();
    }
    // Method within this client that uses the services
    public String greet(){
        return "Hello " + service.getClass();
    }

}
