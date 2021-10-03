package br.wals.gof.abstractfactory;

public class Dog implements Animal{
    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public String getSound() {
        return "bark";
    }
}
