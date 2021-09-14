package dependency_inversion.good;

public interface DatabaseConnection
{
    void connect();
    void disconnect();
}
