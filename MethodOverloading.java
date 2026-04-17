public class MethodOverloading {
    void add(int n){
        System.out.println("n is:"+n);
    }
    int add(int n , int a){
        return n+a;
    }
    void display(){
      System.out.println("method overloading");
    
    }
    public static void main(String[] args) {
        MethodOverloading obj=new MethodOverloading();
       obj.add(3);
      System.out.println(obj.add(3, 4));
        obj.display();
      

    }
}
