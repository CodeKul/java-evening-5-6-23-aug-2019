package threads;

/*1)*/public class MyThread extends Thread {


    @Override
    public void run() {
        super.run();
    }
}

/*2)*/class MyThread2 implements Runnable {

    @Override
    public void run() {

    }
}

class Threads {

    public void make() {


        MyThread t1 = new MyThread();
        t1.start();

        MyThread2 t2 = new MyThread2();
    }

}
