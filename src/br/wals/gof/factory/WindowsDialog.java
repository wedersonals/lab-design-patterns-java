package br.wals.gof.factory;

import br.wals.gof.factory.buttons.Button;
import br.wals.gof.factory.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
