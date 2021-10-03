package br.wals.gof.abstractfactory;

public class AnimalFactory implements AbstractFactory<Animal> {
    @Override
    public Animal create(String type) {
        if ("dog".equalsIgnoreCase(type)) {
            return new Dog();
        } else if ("cat".equalsIgnoreCase(type)) {
            return new Cat();
        }
        return null;
    }
}
