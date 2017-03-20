package programs.practice;

/**
 * Created by dpooni on 3/20/2017.
 */
public class TypeInference {

    static class A{
        public A(){

        }

        public void print(){
            System.out.println("A");
        }

        public static void dis(){
            System.out.println("AS");
        }
    }

    static class B extends A{
        public B(){

        }

        public void print(){
            System.out.println("B");
        }

        public static void dis(){
            System.out.println("BS");
        }
    }

    public static void main(String[] args) {
        A a = new A();
        a.print(); //prints A
        A.dis();
        A a1 = new B();
        a1.print(); //prints B
        B b = new B();
        b.print(); //prints B
        //B b1 = new A(); //compile error
    }
}
