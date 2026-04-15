class Animal
{
    void sound()
    {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal
{
    void sound()
    {
        System.out.println("Dog barks");
    }
}

public class MethodOverridingExample
{
    public static void main(String args[])
    {
        Animal obj1 = new Animal();
        obj1.sound();

        Dog obj2 = new Dog();
        obj2.sound();

        Animal obj3 = new Dog(); // runtime polymorphism
        obj3.sound();
    }
}