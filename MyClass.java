public class MyClass{
    int a, b;
    public void mul(int x, int y){
        a=x;
        b=y;
        int c = a*b;
        System.out.println("Multilication is:" + c);
    }
    public void f1(int x, int y){
        System.out.println("f1");
    }

    public void f2(int x, int y){
        System.out.println("f2");
    }

    public static void main(String args[]){
        MyClass ob = new MyClass();
        ob.mul(5, 10);
        System.out.println("Testing");
    }
}
