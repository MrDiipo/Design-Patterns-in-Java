package PrinciplesAndStrategiesOfDesign.DelegationPrinciple;

public class Printer {
    RealPrinter p = new RealPrinter();

    // create the delegate
    void print(){
        p.print();
    }
}

