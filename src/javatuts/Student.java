package javatuts;

import java.util.ArrayList;

public class Student extends Person {
    String studyingAt;
    double cumGPA;
    ArrayList<String> courses = new ArrayList<String>();

    public Student(String pName, String job, double salary,Sex gender) {
        super(pName, job, salary,gender);
    }
    public void courseDetails(){
        System.out.println(this.personName+ " takes following courses at "+this.studyingAt);
        for(String item: courses){
            System.out.println(item);
        }
    }
    
   
}
