/*
- Robo Resume is an application that get, as input, all info needed to compile a resume, then print it to the screen
 */

package com.danielgkneto.mcjavabc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        //this variable will be used for every user input
        //every input, except for both dates and skills proficiency, are required not to be an empty string.
        String answer = "";

        System.out.println("Welcome to the Robo Resume");
        System.out.println();
        System.out.println("Do you want to print an example resume before making your own? y/n");
        answer = kb.nextLine();

        //Sample resume for testing purposes
        if (answer.equalsIgnoreCase("y")) {
            List<Education> educationList = new ArrayList<>();
            List<Work> workList = new ArrayList<>();
            List<String> jobDescriptions = new ArrayList<>();
            LocalDate date = LocalDate.now();
            List<Skill> skillList = new ArrayList<>();

            educationList.add(new Education("BS.", "Computer Science", "Montgomery College", 2019));
            jobDescriptions.add("Hello World systems developer!");
            workList.add(new Work("IBM", "Java developer", date, date, jobDescriptions));
            skillList.add(new Skill("Cobol", Proficiency.EXPERT.getText()));
            skillList.add(new Skill("Basic", Proficiency.EXPERT.getText()));
            skillList.add(new Skill("JavaScript", Proficiency.NOVICE.getText()));

            Resume testResume = new Resume(1, "Daniel G. K. Neto", "daniel@gmail.com", educationList, workList, skillList);
            printResume(testResume);
            kb.close();
            System.exit(0);
        }

        Resume resume = new Resume();

        //All the loops for each input are being used for validation
        while (true) {
            System.out.println("Enter the person's name: ");
            answer = kb.nextLine();
            if (answer.length() > 0)
                break;
        }
        resume.setName(answer);

        while (true) {
            System.out.println("Enter the person's email: ");
            answer = kb.nextLine();
            if (answer.length() > 0)
                break;
        }
        resume.setEmail(answer);

        List<Education> educationList = new ArrayList<>();

        while (true) {
            Education education = new Education();
            System.out.println("Enter the education achievement");

            while (true) {
                System.out.println("Enter the degree type: ");
                answer = kb.nextLine();
                if (answer.length() > 0)
                    break;
            }
            education.setDegreeType(answer);

            while (true) {
                System.out.println("Enter the major: ");
                answer = kb.nextLine();
                if (answer.length() > 0)
                    break;
            }
            education.setMajor(answer);

            while (true) {
                System.out.println("Enter the university name: ");
                answer = kb.nextLine();
                if (answer.length() > 0)
                    break;
            }
            education.setUniversityName(answer);

            while (true) {
                System.out.println("Enter the graduation year: ");
                answer = kb.nextLine();
                try {
                    Integer.parseInt(answer);
                    break;
                }
                catch (NumberFormatException e) {
                }
            }
            education.setGraduationYear(Integer.parseInt(answer));

            educationList.add(education);

            //the user can enter more than one education achievement
            System.out.println("Do you want to add another education achievement? y/n");
            answer = kb.nextLine();
            if (!answer.equalsIgnoreCase("y"))
                break;
        }
        resume.setEducationList(educationList);

        List<Work> workList = new ArrayList<>();

        while (true) {
            Work work = new Work();
            System.out.println("Enter the work experience");

            while (true) {
                System.out.println("Enter the company name: ");
                answer = kb.nextLine();
                if (answer.length() > 0)
                    break;
            }
            work.setCompany(answer);

            while (true) {
                System.out.println("Enter the job title: ");
                answer = kb.nextLine();
                if (answer.length() > 0)
                    break;
            }
            work.setJobTitle(answer);

            //the dates must be entered in the specific format (yyyy-mm-dd) to be validated correctly)
            LocalDate startDate = LocalDate.now();
            while (true) {
                System.out.println("Enter the start date (yyyy-mm-dd): ");
                answer = kb.nextLine();
                try {
                    startDate = LocalDate.parse(answer);
                    break;
                }
                catch (DateTimeParseException e) {
                }
            }
            work.setStartDate(startDate);

            //the dates must be entered in the specific format (yyyy-mm-dd) to be validated correctly)
            LocalDate endDate = LocalDate.now();
            while (true) {
                System.out.println("Enter the end date (yyyy-mm-dd): ");
                answer = kb.nextLine();
                try {
                    endDate = LocalDate.parse(answer);
                    break;
                }
                catch (DateTimeParseException e) {
                }
            }
            work.setEndDate(endDate);

            List<String> jobDescriptions = new ArrayList<>();

            while (true) {
                while (true) {
                    System.out.println("Enter the job description: ");
                    answer = kb.nextLine();
                    if (answer.length() > 0)
                        break;
                }
                jobDescriptions.add(answer);

                //the user can enter more than one job description for each work
                System.out.println("Do you want to add another job description? y/n");
                answer = kb.nextLine();
                if (!answer.equalsIgnoreCase("y"))
                    break;
            }

            work.setJobDescriptions(jobDescriptions);
            workList.add(work);

            //the user can enter more than one work experience
            System.out.println("Do you want to add another work experience? y/n");
            answer = kb.nextLine();
            if (!answer.equalsIgnoreCase("y"))
                break;
        }

        resume.setWorkList(workList);

        //this is needed to enforce at least 3 skills to be entered
        int skillsCounter = 0;
        List<Skill> skillList = new ArrayList<>();

        while (true) {
            Skill skill = new Skill();
            System.out.println("Enter the skills (at least 3)");

            while (true) {
                System.out.println("Enter the skill name: ");
                answer = kb.nextLine();
                if (answer.length() > 0)
                    break;
            }
            skill.setName(answer);

            while (true) {
                System.out.println("Enter the skill proficiency: " + Proficiency.printOptions());
                answer = kb.nextLine();
                //proficiency is validated against one of the enum options
                try {
                    Proficiency.valueOf(answer.toUpperCase());
                    break;
                }
                catch(IllegalArgumentException e) {
                }
            }
            skill.setProficiency(Proficiency.valueOf(answer.toUpperCase()).getText());

            skillList.add(skill);
            skillsCounter++;
            if (skillsCounter < 3) continue;

            System.out.println("Do you want to add another skill? y/n");
            answer = kb.nextLine();
            if (!answer.equalsIgnoreCase("y"))
                break;
        }

        resume.setSkillList(skillList);

        printResume(resume);
        kb.close();
    }

    static void printResume(Resume resume) {
        System.out.println();
        System.out.println("==============================================================================");
        System.out.println(resume.getName());
        System.out.println(resume.getEmail());
        System.out.println();
        System.out.println("Education");
        for (Education e : resume.getEducationList()) {
            System.out.println(e.getDegreeType() + " in " + e.getMajor() + ",");
            System.out.println(e.getUniversityName() + ", " + e.getGraduationYear());
            System.out.println();
        }

        System.out.println("Experience");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        for (Work w : resume.getWorkList()) {
            System.out.println(w.getJobTitle());
            System.out.println(dtf.format(w.getStartDate()));
            System.out.println(w.getCompany() + ", " + dtf.format(w.getStartDate()) + " - " + dtf.format(w.getStartDate()));
            for (String s : w.getJobDescriptions()) {
                System.out.println(" - " + s);
            }
            System.out.println();
        }

        System.out.println("Skills");
        for (Skill s : resume.getSkillList()) {
            System.out.println(s.getName() + " , " + s.getProficiency());
        }
    }
}
