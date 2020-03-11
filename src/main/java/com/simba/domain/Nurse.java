package com.simba.domain;

import com.simba.service.TraitementEmployee;

public class Nurse extends Employee implements TraitementEmployee {

    public Nurse(Long id, String matricule, String firstName, String lastName) {
        super(id, matricule, firstName, lastName);
    }

    @Override
    public void traiterPatient(Person patient) {
        preleverConstantes();
        fairePansement();
    }

    private void preleverConstantes() {
        System.out.println("prelever constantes...");
    }

    private void fairePansement() {
        System.out.println("faire pansement...");
    }
}
