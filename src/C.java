public class C {

    C(){

    }
    static class D{
        D(){

        }
        static void display(){
            System.out.println("Inner static class");
        }
    }
    int x = 100;
     static void print(){
        System.out.println("C constructor");
    }
}
