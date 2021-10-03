package br.wals.gof.singleton;

/**
 * Singleton "apressado"
 * @author wedersonals
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}