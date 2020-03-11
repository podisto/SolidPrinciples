package com.simba.domain;

import com.simba.service.TraitementEmployee;

public class Doctor extends Employee implements TraitementEmployee {

    public Doctor(Long id, String matricule, String firstName, String lastName) {
        super(id, matricule, firstName, lastName);
    }

    @Override
    public void traiterPatient(Person patient) {
        consulter();
        prescrireOrdonnance();
    }

    private void consulter() {
        System.out.println("consulter patient...");
    }

    private void prescrireOrdonnance() {
        System.out.println("prescrire ordonnance...");
    }

}
