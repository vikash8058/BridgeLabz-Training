package com.oopspillars.hospitalmanagement;


public class OutPatient extends Patient implements MedicalRecord {

    private double consultationFee;
    private String medicalRecord;

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    // Bill calculation for out-patient
    @Override
    public double calculateBill() {
        return consultationFee;
    }

    // Medical record methods
    @Override
    public void addRecord(String diagnosis) {
        this.medicalRecord = diagnosis;
    }

    @Override
    public String viewRecords() {
        return medicalRecord;
    }
}
