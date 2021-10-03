package br.wals.gof.prototype;

import java.util.ArrayList;

public class PrototypeTest {

    public static void run() {
        String[] args = {"Harry", "Tom", null};
        Person person;
        for (String arg : args) {
            person = PersonFactory.getPerson(arg);
            if (person != null) {
                System.out.println(person.toString());
            }
        }
    }
}
