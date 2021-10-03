package br.wals.gof.adapter;

public class Line {
    public void draw(int x1, int y1, int x2, int y2) {
        System.out.println(String.format("Line from point A(%d, %d) to point B(%d, %d)",
                x1, y1, x2, y2));
    }
}
