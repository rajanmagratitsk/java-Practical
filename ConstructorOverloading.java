public class ConstructorOverloading {
int a;
String str;
int b;
     ConstructorOverloading() {
        System.out.println("hello");
    }
    ConstructorOverloading(int a, String str){
        this.a=a;
        this.str=str;
    }

     ConstructorOverloading(int a, String str, int b) {
        this.a = a;
        this.str = str;
        this.b = b;
    }
    void display(){
        System.out.println("int is:"+a+"String is:"+str+"int is:"+b);

    }
    public static void main(String[] args) {
        ConstructorOverloading cog=new ConstructorOverloading();
        ConstructorOverloading cog1=new ConstructorOverloading(1, "rajan");
        ConstructorOverloading cog2=new ConstructorOverloading(1, "nichyo", 27);
        cog.display();
        cog1.display();
        cog2.display();
    }
}
