package com.simba.domain;

public class Employee extends Person {
    private String matricule;

    public Employee(Long id, String nom, String prenom, String matricule) {
        super(id, nom, prenom);
        this.matricule = matricule;
    }
}
