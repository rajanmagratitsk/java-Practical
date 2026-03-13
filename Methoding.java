


public class Methoding {
    int area(int l, int b){
        return l*b;
    }
    int area(int side){
        return side*side;
    }
public static void main(String[] args) {
    Methoding obj=new Methoding();
    System.out.println("area of rectangle is :"+obj.area(3, 5));
    System.out.println("area of square is:"+obj.area(7));
}
    
    


    
}
