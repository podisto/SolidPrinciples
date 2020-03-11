package com.simba;

import com.simba.domain.Doctor;
import com.simba.domain.Nurse;
import com.simba.domain.Patient;
import com.simba.domain.Person;
import com.simba.service.Connection;
import com.simba.service.Elvis;
import com.simba.service.HospitalManagement;
import com.simba.service.TraitementEmployee;

public class Application {
    public static void main(String[] args) {
        Person patient = new Patient(1L, "Dione", "Omar", "11/01/1991", "10000000");

        TraitementEmployee nurse = new Nurse(2L, "1000", "Mariama", "Ndiaye");
        HospitalManagement management = new HospitalManagement(nurse);
        management.traiterPatient(patient);

        TraitementEmployee doctor = new Doctor(3L, "1001", "Sheyma", "Rezki");
        HospitalManagement management2 = new HospitalManagement(doctor);
        management2.traiterPatient(patient);

        Connection connection = Connection.getInstance();
        System.out.println(connection);

        Connection connection2 = Connection.getInstance();
        System.out.println(connection2);

    }
}
