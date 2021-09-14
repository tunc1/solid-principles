package interface_segregation.bad;

public class Cube implements Calculable
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
        return Math.pow(length,2)*6;
    }
    public double volume()
    {
        return Math.pow(length,3);
    }
}