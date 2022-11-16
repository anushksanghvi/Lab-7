public class MyClass{
    int a, b;
    public void mul(int x, int y){
        a=x;
        b=y;
        int c = a*b;
        System.out.println("Multilication is:" + c);
    }

    public void sum(int x, int y){
        a=x;
        b=y;
        int d = a+b;
        System.out.println("Sum is:" + d);
    }


    public static void main(String args[]){
        MyClass ob = new MyClass();
        ob.mul(5, 10);
        ob.sum(5, 10);
    }
}