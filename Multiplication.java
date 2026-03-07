class Multiplication {
     void table(int n){
         for(int i=1;i<=10;i++){
             System.out.println(n+"*"+i+"="+n*i);
         }
     }
     public static void main(String args[]){
         Multiplication rajan=new Multiplication();
         rajan.table(6);
     }
         
    
}