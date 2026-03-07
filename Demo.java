class Demo {

    int add(int a,int b){
        return a+b;
    }

    double average(int total){
        return total/2.0;
    }

    public static void main(String[] args){

        Demo obj = new Demo();

        int total = obj.add(80,90);
        double avg = obj.average(total);

        System.out.println("Total = "+total);
        System.out.println("Average = "+avg);

    }
}