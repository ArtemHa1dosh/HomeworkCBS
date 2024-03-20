package exercise2;

public class Pupil {

    public String FirstName;
    public String LastName;

    public Pupil(String firstName, String lastName) {
        FirstName = firstName;
        LastName = lastName;
    }

    void study(){
        System.out.println(FirstName + " " + LastName + " studying");
    }

    void read(){
        System.out.println(FirstName + " " + LastName + " reading");
    }

    void write(){
        System.out.println(FirstName + " " + LastName + " writing");
    }

    void relax(){
        System.out.println(FirstName + " " + LastName + " relaxing");
    }
}
