package br.wals.gof.facade.subsystem2.cep;

public class ZipCodeApi {

    private static ZipCodeApi instance = new ZipCodeApi();

    private ZipCodeApi() {
        super();
    }

    public static ZipCodeApi getInstance() {
        return instance;
    }

    public String recoverCity(String zipCode) {
        return "Araraquara";
    }

    public String recoverState(String zipCode) {
        return "SP";
    }
}
