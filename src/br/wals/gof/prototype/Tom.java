package br.wals.gof.prototype;

public class Tom implements Person {

    @Override
    public Person clone() {
        return new Tom();
    }

    @Override
    public String toString() {
        return "Tom";
    }
}
