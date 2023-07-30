package com.learningTech;

public class Doctor1 implements Staff1 {
    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String qualification) {
        Qualification = qualification;
    }

    private String Qualification;
    public void assist(){
        System.out.println("doctor is assisting");

    }
}
