package br.wals.gof.chainofresponsability;

public class ChainOfResponsabilityTest {

    public static void run() {
        BankChain bancos = new BankA();
        bancos.setNext(new BankB());
        bancos.setNext(new BankC());
        bancos.setNext(new BankD());

        try {
            bancos.makePayment(BankID.bankC);
            bancos.makePayment(BankID.bankD);
            bancos.makePayment(BankID.bankA);
            bancos.makePayment(BankID.bankB);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
