package multithreading;
// Author D Poonia : Created on 3/16/2017.

public class NumberPrinterJob implements Runnable{

    private int max;
    private boolean isOdd;
    private OddEvenNumberPrinter printer;

    public NumberPrinterJob(OddEvenNumberPrinter print, int max, boolean isOdd) {
        printer = print;
        this.max = max;
        this.isOdd = isOdd;
    }

    public void run() {
        int num = isOdd ? 1 : 2;

        while(num <= max){

            if(isOdd){
                printer.printOdd(num);
            }else{
                printer.printEven(num);

            }

            num = num + 2;

        }

    }
}
