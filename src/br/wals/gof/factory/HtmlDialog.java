package br.wals.gof.factory;

import br.wals.gof.factory.buttons.Button;
import br.wals.gof.factory.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
