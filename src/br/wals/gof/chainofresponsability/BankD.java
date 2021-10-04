package br.wals.gof.chainofresponsability;

public class BankD extends BankChain {

    public BankD() {
        super(BankID.bankD);
    }

    @Override
    protected void doPayment() {
        System.out.println("Payment made at bank D.");
    }
}
