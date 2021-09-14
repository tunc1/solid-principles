package liskov_substitution.bad;

public class PlasticDuck extends Duck
{
    public void fly()
    {
        System.out.println("Plastic duck Can't fly");
    }
    public void swim()
    {
        System.out.println("Plastic duck is swimming in bath");
    }
}