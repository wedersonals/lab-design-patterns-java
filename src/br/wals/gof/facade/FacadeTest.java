package br.wals.gof.facade;

public class FacadeTest {

    public static void run() {
        System.out.println("\n> Facade");
        Facade facade = new Facade();
        facade.migrarCliente("Aline", "14801788");
    }
}
