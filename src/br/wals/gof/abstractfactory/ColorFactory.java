package br.wals.gof.abstractfactory;

public class ColorFactory implements AbstractFactory<Color> {
    @Override
    public Color create(String type) {
        if ("while".equalsIgnoreCase(type)) {
            return new White();
        } else if ("black".equalsIgnoreCase(type)) {
            return new Black();
        }
        return null;
    }
}
