package dependency_inversion.bad;

public class MySQLConnection
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