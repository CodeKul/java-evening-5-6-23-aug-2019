package interfaces;

public class BankAtm {

    void txn(IAtm atm) {
        atm.withDaraw(100);
    }
}

interface IAtm {

    void withDaraw(int amt);

    void balEnq(String acNum);
}

class UbiAtm implements  IAtm{

    @Override
    public void withDaraw(int amt) {

    }

    @Override
    public void balEnq(String acNum) {

    }
}

class AxisAtm implements IAtm{

    @Override
    public void withDaraw(int amt) {

    }

    @Override
    public void balEnq(String acNum) {

    }
}

class MainBk {
    public static void main(String[] args) {

        IAtm atm = new AxisAtm();

        IAtm atmUbi = new UbiAtm();
        BankAtm ba = new BankAtm();
        ba.txn(atmUbi);
    }
}