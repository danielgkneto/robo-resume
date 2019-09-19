package com.danielgkneto.mcjavabc;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String answer = "";
        boolean isDone = false;
        Resume resume = new Resume();

        System.out.println("Welcome to the Resume Robot");
        System.out.println();

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

            System.out.println("Do you want to add another education achievement? y/n");
            answer = kb.nextLine();
            if (!answer.equalsIgnoreCase("y"))
                break;
        }
        resume.setEducationList(educationList);

        //TODO job descriptions and skills
    }
}
