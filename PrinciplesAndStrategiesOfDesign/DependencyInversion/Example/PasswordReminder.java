package PrinciplesAndStrategiesOfDesign.DependencyInversion.Example;

public class PasswordReminder {
    private DBConnectionInterface dbConnection;

    public PasswordReminder(DBConnectionInterface dbConnection){
        this.dbConnection = dbConnection;
    }
}
