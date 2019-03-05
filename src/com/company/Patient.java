package com.company;

public class Patient {
    private String name;
    private String surname;
    private long pesel;

    public Patient(String name, String surname, long pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    public Patient(Patient patient) {
        this(patient.getName(), patient.getSurname(), patient.getPesel());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getPesel() {
        return pesel;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

    public Patient() {

    }

}
