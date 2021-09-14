package interface_segregation.good;

public class Square implements Area
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
}