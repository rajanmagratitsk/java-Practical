class Animal{
     void sound(){
        System.out.println("animal eats");

    }

}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("DOg barks");
    }
}
public class MethodOverridingExample{
    public static void main(String[] args) {
       Animal an=new Animal();
       Dog dg=new Dog();
       Animal an1 =new Dog(); 
       an.sound();
       dg.sound();
       an1.sound();

    }
}