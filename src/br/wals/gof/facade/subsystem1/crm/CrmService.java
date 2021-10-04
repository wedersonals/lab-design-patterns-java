package br.wals.gof.facade.subsystem1.crm;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void saveClient(String name, String zipCode, String city, String state) {
        System.out.println("Customer saved in CRM system.");
        System.out.println(name);
        System.out.println(zipCode);
        System.out.println(city);
        System.out.println(state);
    }
}
