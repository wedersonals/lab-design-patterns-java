package br.wals.gof.abstractfactory;

public class AbstractFactoryTest {

    public static void run() {
        AbstractFactory abstractFactory;

        abstractFactory = ProviderFactory.getFactory("animal");
        Animal animal = (Animal) abstractFactory.create("dog");

        abstractFactory = ProviderFactory.getFactory("color");
        Color color = (Color) abstractFactory.create("black");

        System.out.println("Animal " + animal.getType() + ", color: " + color.getColor() +
                ", sound: " + animal.getSound());
    }
}
