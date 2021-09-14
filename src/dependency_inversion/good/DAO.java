package dependency_inversion.good;

public class DAO
{
    private DatabaseConnection databaseConnection;
    public DAO(DatabaseConnection databaseConnection)
    {
        this.databaseConnection=databaseConnection;
    }
    public void save()
    {
        databaseConnection.connect();
        System.out.println("Saving to the Database");
        databaseConnection.disconnect();
    }
}