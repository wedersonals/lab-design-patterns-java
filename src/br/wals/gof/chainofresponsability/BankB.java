package br.wals.gof.chainofresponsability;

public class BankB extends BankChain {

    public BankB() {
        super(BankID.bankB);
    }

    @Override
    protected void doPayment() {
        System.out.println("Payment made at bank B.");
    }
}
