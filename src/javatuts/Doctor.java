package javatuts;
public class Doctor extends Person implements IDoctor{

    String certNumber;
    public Doctor(String pName, String job, double salary,Sex gender) {
        super(pName, job, salary,gender);
    }


    @Override
    public void healAPerson(Person p) {
        System.out.println("Good Job Dr. "+this.personName );
        System.out.println(p.personName+ " is healing thanks to you");
    }
}
