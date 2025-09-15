public class B extends A {
    static int b=200;
    int bb=100;
    static {
        b=300;
        System.out.println("static block");

    }
    {
        bb=222;
        b=400;
        System.out.println("1nd instance initialization block");
    }
    {

        b=400;
        System.out.println("2nd instance initialization block");
    }

    B(){
        System.out.println("empty constuctor");
    }
    B(int b){
        this.b=b;
        this .bb =900;
        System.out.println("parameterized constructor");
    }
       void print(){
        System.out.println("B constructor");
    }
}
