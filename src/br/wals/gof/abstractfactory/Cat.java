package br.wals.gof.abstractfactory;

public class Cat implements Animal {
    @Override
    public String getType() {
        return "Cat";
    }

    @Override
    public String getSound() {
        return "meow";
    }
}
