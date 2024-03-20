package exercise2;

public class BadPupil extends Pupil{
    public BadPupil(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    void study(){
        System.out.println(FirstName + " " + LastName + " studying bad");
    }
    @Override
    void read(){
        System.out.println(FirstName + " " + LastName + " reading bad");
    }
    @Override
    void write(){
        System.out.println(FirstName + " " + LastName + " writing bad");
    }
    @Override
    void relax(){
        System.out.println(FirstName + " " + LastName + " relaxing all the time");
    }
}
