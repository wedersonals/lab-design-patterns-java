package br.wals.gof.singleton;

/**
 * Singleton "apressado"
 * @author wedersonals
 */
public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}