package br.wals.gof.factory;

import br.wals.gof.factory.buttons.Button;

public abstract class Dialog {
    public void render() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
