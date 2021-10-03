package br.wals.gof.factory.buttons;

public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("Html Button");
    }

    @Override
    public void onClick() {
        System.out.println("Html Button - click");
    }
}
