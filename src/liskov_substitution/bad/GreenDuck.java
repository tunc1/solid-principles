package liskov_substitution.bad;

public class GreenDuck extends Duck
{
    public void fly()
    {
        System.out.println("Green duck is flying");
    }
    public void swim()
    {
        System.out.println("Green duck is swimming");
    }
}