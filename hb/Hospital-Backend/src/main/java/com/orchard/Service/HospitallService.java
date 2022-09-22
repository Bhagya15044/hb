package com.orchard.Service;

import java.util.List;

import com.orchard.Entity.Doctorentity;
import com.orchard.Entity.Patiententity;


public interface HospitallService {

 
    public boolean saveDoctorInformation(Doctorentity doctor);
    public boolean savePatientInformation(Patiententity patient);
    public List<Patiententity> getPatientListOfDoctor(String name,Doctorentity doctor);
    public List<Doctorentity> getDoctors();
	Patiententity DisplayPatientInformation1(Integer id);
	Doctorentity DisplayDoctorInformation1(String name);
	

}
