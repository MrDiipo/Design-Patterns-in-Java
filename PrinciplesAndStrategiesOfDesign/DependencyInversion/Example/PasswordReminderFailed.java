package PrinciplesAndStrategiesOfDesign.DependencyInversion.Example;

// This class violates the principle
public class PasswordReminderFailed {
    private MySqlConnection dbConnection;

    public PasswordReminderFailed(MySqlConnection dbConnection){
        this.dbConnection = dbConnection;
    }
}
