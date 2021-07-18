package PrinciplesAndStrategiesOfDesign.DependencyInversion.Example;

// This class violates the principle
public class PasswordReminderFailed {
    private int dbConnection;

    public PasswordReminderFailed(MySqlConnection dbConnection){
        this.dbConnection = dbConnection;
    }
}
