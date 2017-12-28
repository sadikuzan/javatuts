/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatuts;

import java.util.Date;



/**
 *
 * @author OS
 */
public class JavaTuts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p1 = new Person("Büşra Cengiz","Civil Engineer",1750.5,Sex.FEMALE);
        p1.exucuteDeteails();
        System.out.println("-------------");
        Student s1 = new Student("Sadık Uzan","Student",0.0,Sex.MALE);
        s1.studyingAt = "Middle East Techinacal University";
        s1.courses.add("Heat Transfer | Mech 311");
        s1.courses.add("Theory of Mechines | Mech 301");
        s1.exucuteDeteails();
        System.out.println("-------------");
        s1.courseDetails();
        System.out.println("-------------");
        Doctor dr = new Doctor("Mehmet Öz","Doctor",5000.0,Sex.MALE);
        dr.certNumber = "21as4d5612344";
        dr.healAPerson(p1);
        System.out.println("-------------");
        dr.healAPerson(s1);
    }
    
    
}

