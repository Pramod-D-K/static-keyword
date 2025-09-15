public class C extends B {

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
        void print(){
        System.out.println("C constructor");
    }
}
