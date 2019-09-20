package com.danielgkneto.mcjavabc;

public enum Proficiency {
    FUNDAMENTAL("Fundamental"), NOVICE("Novice"), INTERMEDIATE("Intermediate"), ADVANCED("Advanced"), EXPERT("Expert");

    private String text;

    Proficiency(String text) {
        this.setText(text);
    }

    static public String printOptions() {
        String s = "( ";
        for (Proficiency p : Proficiency.values())
            s = s.concat(p.getText()) + " ";
        s = s.concat(")");
        return s;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
