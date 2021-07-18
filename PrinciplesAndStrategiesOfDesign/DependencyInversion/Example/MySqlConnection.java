package PrinciplesAndStrategiesOfDesign.DependencyInversion.Example;

public class MySqlConnection implements DBConnectionInterface{
    @Override
    public int connect(){
        return 1;
    }
}
