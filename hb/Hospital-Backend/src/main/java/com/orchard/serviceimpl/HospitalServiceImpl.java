package com.orchard.serviceimpl;

import com.orchard.Entity.Doctorentity;
import com.orchard.Entity.Patiententity;
import com.orchard.Repository.DoctorinfoRepository;
import com.orchard.Repository.PatientinfoRepository;
import com.orchard.Service.HospitallService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class HospitalServiceImpl implements HospitallService {

    @Autowired
    DoctorinfoRepository doctorRepository;
    @Autowired
    PatientinfoRepository patientRepository;
    @Override
    public Doctorentity DisplayDoctorInformation1(String name) {
        return doctorRepository.findByName(name);
    }
    @Override
    public Patiententity DisplayPatientInformation1(Integer id) {
        return patientRepository.findById(id).get();
    }

    @Override
    public boolean saveDoctorInformation(Doctorentity doctor) {
        doctorRepository.save(doctor);
        return true;
    }

    @Override
    public boolean savePatientInformation(Patiententity patient) {

        Doctorentity doctor = doctorRepository.findByName(patient.getDoctor_name());
        doctor.addPatients(patient);
        patientRepository.save(patient);
        doctor.setPatient_count();
        return true;
    }

    @Override
    public List<Patiententity> getPatientListOfDoctor(String name, Doctorentity doctor) {
        return doctor.getPatients();
    }

    @Override
    public List<Doctorentity> getDoctors() {
        return (List<Doctorentity>) doctorRepository.findAll();
    }

}
