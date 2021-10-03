package br.wals.gof.adapter;

public class Rectangle {
    public void draw(int x, int y, int width, int height) {
        System.out.println(String.format("Rectangle with coordinate left-down(%d, %d), width: %d, height: %d",
                x, y, width, height));
    }
}
