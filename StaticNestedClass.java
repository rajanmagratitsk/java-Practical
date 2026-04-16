public class StaticNestedClass {
    static class NestingStatic{
        public void display(){
            System.out.println("hello i am nested class");

        }
        
    }
    public static void main(String[] args) {
            StaticNestedClass.NestingStatic sns=new StaticNestedClass.NestingStatic();
            sns.display();
            
        }
    
}
