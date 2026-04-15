public class MethodOverloading {
    int add(int n){
        return n;
    }
    int add(int n , int a){
        return n+a;
    }
    void display(){
      System.out.println("method overloading");
    
    }
    public static void main(String[] args) {
        MethodOverloading obj=new MethodOverloading();
        int result1=obj.add(5);
        int result2=obj.add(5,6);

        obj.display();
        System.out.println(result1+" "+result2);

    }
}
