package interfaces;

public abstract interface GpsListener {

    public static final int ACC = 10;

    public abstract void find();

    void run();

}

interface LightListener extends GpsListener, Runnable {

}

class Sensor implements  LightListener {

    @Override
    public void find() {

    }

    @Override
    public void run() {

    }
}



