package br.wals.gof.abstractfactory;

public class ProviderFactory {

    public static AbstractFactory getFactory(String type) {
        if ("animal".equalsIgnoreCase(type)) {
            return new AnimalFactory();
        } else if ("color".equalsIgnoreCase(type)) {
            return new ColorFactory();
        }
        return null;
    }
}
