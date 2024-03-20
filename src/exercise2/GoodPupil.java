package exercise2;

public class GoodPupil extends Pupil{

    public GoodPupil(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    void study(){
        System.out.println(FirstName + " " + LastName + " studying good");
    }
    @Override
    void read(){
        System.out.println(FirstName + " " + LastName + " reading good");
    }
    @Override
    void write(){
        System.out.println(FirstName + " " + LastName + " writing good");
    }
    @Override
    void relax(){
        System.out.println(FirstName + " " + LastName + " relaxing sometimes");
    }
}
