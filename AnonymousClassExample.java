abstract class AnonymousExample{
    public abstract void display();


}
public class AnonymousClassExample{
    public static void main(String[] args) {
        
    
    AnonymousExample am=new AnonymousExample() {
        public void display(){
            System.out.println("this is anonymous class example");


        }
        
    };
    am.display();
}
}
