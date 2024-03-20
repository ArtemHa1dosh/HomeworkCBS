package exercise2;

public class ExcellentPupil extends Pupil{
    public ExcellentPupil(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    void study(){
        System.out.println(FirstName + " " + LastName + " studying excellent");
    }
    @Override
    void read(){
        System.out.println(FirstName + " " + LastName + " reading excellent");
    }
    @Override
    void write(){
        System.out.println(FirstName + " " + LastName + " writing excellent");
    }
    @Override
    void relax(){
        System.out.println(FirstName + " " + LastName + " relaxing rarely");
    }
}
