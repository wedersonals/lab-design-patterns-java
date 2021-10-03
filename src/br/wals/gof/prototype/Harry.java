package br.wals.gof.prototype;

public class Harry implements Person {

    @Override
    public Person clone() {
        return new Harry();
    }

    @Override
    public String toString() {
        return "Harry";
    }
}
