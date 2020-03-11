package com.simba.service;
import com.simba.domain.Person;

public class HospitalManagement {

    private TraitementEmployee employee;

    public HospitalManagement(TraitementEmployee employee) {
        this.employee = employee;
    }

    public void traiterPatient(Person patient) {
        System.out.println("traitement du patient " + patient);
        employee.traiterPatient(patient);
    }

}
