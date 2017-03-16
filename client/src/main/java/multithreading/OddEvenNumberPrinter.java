package multithreading;
// Author D Poonia : Created on 3/16/2017.

public class OddEvenNumberPrinter {

    private boolean isOdd = false;

    public void printOdd(int n){

        synchronized (this){
            while(!isOdd){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName());
            System.out.println(n);
            isOdd = false;
            notifyAll();
        }
    }

    public void printEven(int n){

        synchronized (this){
            while(isOdd){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName());
            System.out.println(n);
            isOdd = true;
            notifyAll();
        }
    }
}
