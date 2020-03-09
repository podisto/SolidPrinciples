package com.simba.domain;

public class Patient extends Person {
    private String cin;
    private String dateNaissance;

    public Patient(Long id, String nom, String prenom, String cin, String dateNaissance) {
        super(id, nom, prenom);
        this.cin = cin;
        this.dateNaissance = dateNaissance;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "cin='" + cin + '\'' +
                ", dateNaissance='" + dateNaissance + '\'' +
                '}';
    }
}
