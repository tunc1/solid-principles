package interface_segregation.bad;

public class Square implements Calculable
{
    private double length;
    public double getLength()
    {
        return length;
    }
    public void setLength(double length)
    {
        this.length=length;
    }
    public double area()
    {
        return Math.pow(length,2);
    }
    public double volume()
    {
        return 0;
    }
}