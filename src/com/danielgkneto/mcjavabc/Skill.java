package com.danielgkneto.mcjavabc;

public class Skill {
    private String name;
    private String proficiency;

    public Skill() {
    }

    public Skill(String name, String proficiency) {
        this.setName(name);
        this.setProficiency(proficiency);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProficiency() {
        return proficiency;
    }

    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }
}
