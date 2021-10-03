package br.wals.gof.factory;

public class FactoryTest {

    private static Dialog dialog;

    public static void run() {
        configure();
        renderDialog();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void renderDialog() {
        dialog.render();
    }
}
