package multithreading;

import org.junit.Test;

import static org.junit.Assert.*;

// Author D Poonia : Created on 3/16/2017.

public class NumberPrinterJobTest {

    public static void main(String[] args) {
        OddEvenNumberPrinter print = new OddEvenNumberPrinter();
        Thread t1 = new Thread(new NumberPrinterJob(print, 10, true), "Odd Thread");
        Thread t2 = new Thread(new NumberPrinterJob(print, 10, false), "Even Thread");
        t1.start();
        t2.start();
    }

}