package ThreadPrac;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class Thread {

    class ThreadClass extends Thread {
        public void run() {
            System.out.println("Thread is running");
        }
    }

    public static void main(String[] args) {
        ThreadClass t1 = new ThreadClass();

        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

}
