package com.danielgkneto.mcjavabc;

import java.util.ArrayList;
import java.util.List;

public class Resume {
    private int id;
    private String name;
    private String email;
    private List<Education> educationList;
    private List<Work> workList;
    private List<Skill> skillList;

    public Resume() {
        this.educationList = new ArrayList<>();
        this.workList = new ArrayList<>();
        this.skillList = new ArrayList<>();
    }

    public Resume(int id, String name, String email, List<Education> educationList, List<Work> workList, List<Skill> skillList) {
        this();
        this.setId(id);
        this.setName(name);
        this.setEmail(email);
        this.setEducationList(educationList);
        this.setWorkList(workList);
        this.setSkillList(skillList);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Education> getEducationList() {
        return new ArrayList<Education>(this.educationList);
//        return educationList;
    }

    public void setEducationList(List<Education> educationList) {
        this.educationList = new ArrayList<Education>(educationList);
    }

    public List<Work> getWorkList() {
        return new ArrayList<Work>(this.workList);
    }

    public void setWorkList(List<Work> workList) {
        this.workList = new ArrayList<Work>(workList);
    }

    public List<Skill> getSkillList() {
        return new ArrayList<Skill>(this.skillList);
    }

    public void setSkillList(List<Skill> skillList) {
        this.skillList = new ArrayList<Skill>(skillList);
    }
}
