

class Adder{
    static int Mean(int a){
        return a;
    }
    static float Mean(int a ,int b){
        return  a + b;
    }
    static float Mean(int a, int b){
        return (a + b)/2;
    }
}

public class mean {
       
    public static void main(String[] args){

        System.out.println(Adder.Mean(11));
        System.out.println(Adder.Mean(11, 22));
        System.out.println(Adder.Mean(11.5,12.5));
        
    }
}
