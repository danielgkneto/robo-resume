package com.danielgkneto.mcjavabc;

public class Education {
    private String degreeType;
    private String major;
    private String universityName;
    private int graduationYear;

    public Education() {
    }

    public Education(String degreeType, String major, String universityName, int graduationYear) {
        this.setDegreeType(degreeType);
        this.setMajor(major);
        this.setUniversityName(universityName);
        this.setGraduationYear(graduationYear);
    }

    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }
}
