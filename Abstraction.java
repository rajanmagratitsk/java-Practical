


abstract class Bank{
    abstract int rateofInterest();
}
class EBL extends Bank{
    int rateofInterest(){
        return 3;
    }
}
class NBL extends Bank{
    int rateofInterest(){
        return 4;
    }
}
public class Abstraction {
    public static void main(String args[]){
        Bank obj1=new EBL();
        Bank obj2=new NBL();
        System.out.println("Interest rate of Everest bank = "+obj1.rateofInterest()+"%");
        System.out.println("Interest rate of Nepal bank= "+obj2.rateofInterest()+"%");
    }
}
