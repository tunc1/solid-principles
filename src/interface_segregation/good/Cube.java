package interface_segregation.good;

public class Cube implements Area,Volume
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