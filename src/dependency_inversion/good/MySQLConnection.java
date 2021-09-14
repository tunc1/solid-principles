package dependency_inversion.good;

public class MySQLConnection implements DatabaseConnection
{
    public void connect()
    {
        System.out.println("Connecting to MySQL");
    }
    public void disconnect()
    {
        System.out.println("Disconnecting from MySQL");
    }
}