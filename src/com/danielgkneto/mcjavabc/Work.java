package com.danielgkneto.mcjavabc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Work {
    private String company;
    private String jobTitle;
    private Date startDate;
    private Date endDate;
    private List<String> jobDescriptions;

    public Work() {
        this.jobDescriptions = new ArrayList<>();
    }

    public Work(String company, String jobTitle, Date startDate, Date endDate, List<String> jobDescriptions) {
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

    public Date getStartDate() {
        return (Date) this.startDate.clone();
    }

    public void setStartDate(Date startDate) {
        this.startDate = (Date) startDate.clone();
    }

    public Date getEndDate() {
        return (Date) this.endDate.clone();
    }

    public void setEndDate(Date endDate) {
        this.endDate = (Date) endDate.clone();
    }

    public List<String> getJobDescriptions() {
        return new ArrayList<String>(this.jobDescriptions);
    }

    public void setJobDescriptions(List<String> jobDescriptions) {
        this.jobDescriptions = new ArrayList<String>(jobDescriptions);
    }
}
