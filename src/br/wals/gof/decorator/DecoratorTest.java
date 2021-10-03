package br.wals.gof.decorator;

public class DecoratorTest {
    public static void run() {
        Widget widget = new BorderDecorator(new ScrollDecorator(new TextField(50, 60)));
        widget.draw();
    }
}
