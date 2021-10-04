package br.wals.gof.facade;

import br.wals.gof.facade.subsystem1.crm.CrmService;
import br.wals.gof.facade.subsystem2.cep.ZipCodeApi;

public class Facade {

    public void migrateClient(String name, String zipCode) {
        String city = ZipCodeApi.getInstance().recoverCity(zipCode);
        String state = ZipCodeApi.getInstance().recoverState(zipCode);
        CrmService.saveClient(name, zipCode, city, state);
    }
}
