package sancochocherne;

import java.util.concurrent.Semaphore;
import static java.lang.Thread.*;

public class SancochoCherne {

    public static void main(String[] args) {
        Semaphore se1 = new Semaphore(0);
        Semaphore se2 = new Semaphore(-1);
        Semaphore se3 = new Semaphore(-3);
        Semaphore se4 = new Semaphore(-1);
        Semaphore se5 = new Semaphore(-1);
        Semaphore se6 = new Semaphore(0);
        Semaphore se7 = new Semaphore(0);

        Hilo H1 = new Hilo("H1", se1, se2, se3, se4, se5, se6,se7);
        H1.start();
        Hilo H2 = new Hilo("H2", se1, se2, se3, se4, se5, se6,se7);
        H2.start();
        Hilo H3 = new Hilo("H3", se1, se2, se3, se4, se5, se6,se7);
        H3.start();
        Hilo H4 = new Hilo("H4", se1, se2, se3, se4, se5, se6,se7);
        H4.start();
        Hilo H5 = new Hilo("H5", se1, se2, se3, se4, se5, se6,se7);
        H5.start();
        Hilo H6 = new Hilo("H6", se1, se2, se3, se4, se5, se6,se7);
        H6.start();
        Hilo H7 = new Hilo("H7", se1, se2, se3, se4, se5, se6,se7);
        H7.start();
         Hilo H8 = new Hilo("H8", se1, se2, se3, se4, se5, se6,se7);
        H8.start();
        Hilo H9 = new Hilo("H9", se1, se2, se3, se4, se5, se6,se7);
        H9.start();
        Hilo H10 = new Hilo("H10", se1, se2, se3, se4, se5, se6,se7);
        H10.start();
        Hilo H11 = new Hilo("H11", se1, se2, se3, se4, se5, se6,se7);
        H11.start();
        Hilo H12 = new Hilo("H12", se1, se2, se3, se4, se5, se6,se7);
        H12.start();
        Hilo H13 = new Hilo("H13", se1, se2, se3, se4, se5, se6,se7);
        H13.start();
        Hilo H14 = new Hilo("H14",se1, se2, se3, se4, se5, se6,se7);
        H14.start();

    }

}
