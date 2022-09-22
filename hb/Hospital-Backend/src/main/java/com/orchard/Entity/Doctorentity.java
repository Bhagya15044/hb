package com.orchard.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFilter;

@Entity
@JsonFilter("DoctorFilter")
public class Doctorentity {

   
	@Id
    @GeneratedValue
    private Integer id;
    @Column(unique = true)
    private String name;
    private Integer age;
    private String gender;
    private String field;
    private Integer patient_count = 0;

    @OneToMany
    private List<Patiententity> patients;

    public List<Patiententity> getPatients() {
        return patients;
    }

    public void addPatients(Patiententity patient) {
        patients.add(patient);
    }
    public  Doctorentity() {
    	
    }

    public Doctorentity(String name, Integer age, String gender, String field) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.field = field;
    }

    @Override
    public String toString() {
        return "Doctor [age=" + age + ", field=" + field + ", gender=" + gender + ", id=" + id + ", name=" + name + "]";
    }

    public Integer getPatient_count() {
        return patient_count;
    }

    public void setPatient_count() {
        this.patient_count += 1;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

}