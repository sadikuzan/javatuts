/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatuts;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author OS
 */
public class Person {
    
    String personName;
    Sex gender;
    String job;
    double salary = 0.0;

    //Consructor
    public Person(String pName,String job,double salary,Sex gender){
        this.personName = pName;
        this.job = job;
        this.salary = salary;
        this.gender = gender;
    }
    public void PrintYas(){
    }
    public void exucuteDeteails(){
        System.out.println(this.personName+" is a human being...");
        System.out.println(setGenderName()+"'s job is "+this.job);
        System.out.println(setGenderName()+" makes "+this.salary+" per month");
    }
    
    private String setGenderName()
    {
        switch(this.gender){
            case MALE : return "He"; 
            case FEMALE : return "She";
            default: return "Undefined";
        }
    }
}
