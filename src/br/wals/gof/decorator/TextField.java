package br.wals.gof.decorator;

public class TextField implements Widget {
    private int width;
    private int height;

    public TextField(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println(String.format("TextField: %d, %d", width, height));
    }
}
