package br.wals.gof.chainofresponsability;

public class BankC extends BankChain {

    public BankC() {
        super(BankID.bankC);
    }

    @Override
    protected void doPayment() {
        System.out.println("Payment made at bank C.");
    }
}
