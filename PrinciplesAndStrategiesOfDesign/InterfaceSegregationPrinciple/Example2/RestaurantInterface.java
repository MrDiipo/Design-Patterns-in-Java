package PrinciplesAndStrategiesOfDesign.InterfaceSegregationPrinciple.Example2;

public interface RestaurantInterface {
    // Initial Fat interface before splitting
    public void acceptOnlineOrder();
    public void takeTelephoneOrder();
    public void payOnline();
    public void walkInCustomerOrder();
    public void payInPerson();
}
