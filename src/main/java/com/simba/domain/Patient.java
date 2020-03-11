package com.simba.domain;

public class Patient extends Person {
    private String dateNaissance;
    private String cin;

    public Patient(Long id, String nom, String prenom, String dateNaissance, String cin) {
        super(id, nom, prenom);
        this.dateNaissance = dateNaissance;
        this.cin = cin;
    }
}
