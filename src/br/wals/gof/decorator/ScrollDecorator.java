package br.wals.gof.decorator;

public class ScrollDecorator extends Decorator {

    public ScrollDecorator(Widget widget) {
        super(widget);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("  Scroll Decorator");
    }
}
