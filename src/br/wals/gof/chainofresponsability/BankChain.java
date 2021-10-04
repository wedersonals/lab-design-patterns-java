package br.wals.gof.chainofresponsability;

public abstract class BankChain {
    protected BankID bankID;
    protected BankChain next;

    public BankChain(BankID bankID) {
        this.bankID = bankID;
        this.next = null;
    }

    public void setNext(BankChain bankChain) {
        if (next == null) {
            next = bankChain;
        } else {
            next.setNext(bankChain);
        }
    }

    public void makePayment(BankID bankID) throws Exception {
        if (canMakePayment(bankID)) {
            doPayment();
        } else {
            if (next == null) {
                throw new Exception("Unregistered bank");
            }
            next.makePayment(bankID);
        }
    }

    private boolean canMakePayment(BankID bankID) {
        return this.bankID == bankID;
    }

    protected abstract void doPayment();
}
