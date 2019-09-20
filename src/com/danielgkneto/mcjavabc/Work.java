package com.danielgkneto.mcjavabc;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Work {
    private String company;
    private String jobTitle;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<String> jobDescriptions;

    public Work() {
        this.jobDescriptions = new ArrayList<>();
    }

    public Work(String company, String jobTitle, LocalDate startDate, LocalDate endDate, List<String> jobDescriptions) {
        this();
        this.setCompany(company);
        this.setJobTitle(jobTitle);
        this.setStartDate(startDate);
        this.setEndDate(endDate);
        this.setJobDescriptions(jobDescriptions);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public LocalDate getStartDate()
    {
        LocalDate date = LocalDate.from(this.startDate);
        return date;
    }

    public void setStartDate(LocalDate startDate) {
        LocalDate date = LocalDate.from(startDate);
        this.startDate = date;
    }

    public LocalDate getEndDate() {
        LocalDate date = LocalDate.from(this.endDate);
        return date;
    }

    public void setEndDate(LocalDate endDate) {
        LocalDate date = LocalDate.from(endDate);
        this.endDate = date;
    }

    public List<String> getJobDescriptions() {
        return new ArrayList<String>(this.jobDescriptions);
    }

    public void setJobDescriptions(List<String> jobDescriptions) {
        this.jobDescriptions = new ArrayList<String>(jobDescriptions);
    }
}
