package br.wals.gof.singleton;

public class SingletonTest {

    public static void run() {
        testSingletonLazy();
        testSingletonEager();
        testSingletonLazyHolder();
    }

    private static void testSingletonLazyHolder() {
        System.out.println("\n> Singleton - Test Lazy Holder");
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
    }

    private static void testSingletonEager() {
        System.out.println("\n> Singleton - Test Eager");
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);
    }

    private static void testSingletonLazy() {
        System.out.println("> Singleton - Test Lazy");
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
    }
}
