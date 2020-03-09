package com.simba;

import com.simba.domain.Nurse;
import com.simba.domain.Patient;
import com.simba.service.HospitalManagement;

public class Application {
    public static void main(String[] args) {

        HospitalManagement service = new HospitalManagement();
        Patient omar = new Patient(1L, "DIONE", "Omar", "10000", "11/01/1991");
        Nurse helene = new Nurse(2L, "10001", "Helene", "Durand");

        service.traiterPatient(helene, omar);
    }
}
