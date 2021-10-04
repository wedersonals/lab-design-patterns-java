package br.wals.gof.chainofresponsability;

public class BankA extends BankChain {

    public BankA() {
        super(BankID.bankA);
    }

    @Override
    protected void doPayment() {
        System.out.println("Payment made at bank A.");
    }
}
