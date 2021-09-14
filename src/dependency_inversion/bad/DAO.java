package dependency_inversion.bad;

public class DAO
{
    private MySQLConnection mySQLConnection;
    public DAO(MySQLConnection mySQLConnection)
    {
        this.mySQLConnection=mySQLConnection;
    }
    public void save()
    {
        mySQLConnection.connect();
        System.out.println("Saving to the Database");
        mySQLConnection.disconnect();
    }
}