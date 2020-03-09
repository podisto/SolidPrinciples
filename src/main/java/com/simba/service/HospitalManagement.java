package com.simba.service;

import com.simba.domain.Doctor;
import com.simba.domain.Employee;
import com.simba.domain.Nurse;
import com.simba.domain.Patient;

public class HospitalManagement {

    public void traiterPatient(Employee employee, Patient patient) {
        System.out.println("traitement du patient " + patient);
        if (employee instanceof Nurse) {
            preleverConstantes(patient);
            fairePansement();
        } else if (employee instanceof Doctor) {
            consulter(patient);
            prescrireOrdonnance(patient);
        }
    }

    private void consulter(Patient patient) {
        System.out.println("consultation du patient " + patient);
    }

    private void prescrireOrdonnance(Patient patient) {
        System.out.println("prescription ordonnance au patient " + patient);
    }

    private void preleverConstantes(Patient patient) {
        System.out.println("prelevement constantes du patient " + patient);
    }

    private void fairePansement() {
        System.out.println("faire pansement...");
    }
}
