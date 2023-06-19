package ThreadPrac;

class ThreadClass1 extends Thread {
    public void run(int arg1) {
        System.out.println("[Thread1] " + arg1);
    }
}

class ThreadClass2 extends Thread {
    public void run(int arg1) {
        System.out.println("[Thread2] " + arg1);
    }
}

public class ThreadSample {
    public static void main(String[] args) {
        ThreadClass1 t1 = new ThreadClass1();
        ThreadClass2 t2 = new ThreadClass2();

        t1.start();
        t2.start();

        for (int i = 0; i < 9; i++) {
            System.out.println(i);
        }
    }

}
