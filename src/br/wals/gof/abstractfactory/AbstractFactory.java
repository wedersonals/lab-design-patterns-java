package br.wals.gof.abstractfactory;

public abstract interface AbstractFactory<T> {
    abstract T create(String type);
}
