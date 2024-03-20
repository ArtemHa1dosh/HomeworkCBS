package exercise2;

public class ClassRoom {
    Pupil[] pupils;

//    public ClassRoom(Pupil pupil) {
//        this.pupil = pupil;
//    }


    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        pupils = new Pupil[]{pupil1, pupil2, pupil3, pupil4};
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        pupils = new Pupil[]{pupil1, pupil2, pupil3};
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2) {
        pupils = new Pupil[]{pupil1, pupil2};
    }

    public void pupilActivities() {
        for (Pupil pupil : pupils) {
            pupil.study();
            pupil.read();
            pupil.write();
            pupil.relax();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pupil pupil1 = new ExcellentPupil("Ivan", "Ivanov");
        Pupil pupil2 = new GoodPupil("Pavel", "Petruskin");
        Pupil pupil3 = new BadPupil("Roman", "Korobov");
        Pupil pupil4 = new Pupil("Borys", "Bantus");

        ClassRoom classRoom = new ClassRoom(pupil1, pupil2, pupil3);
        classRoom.pupilActivities();
    }
}
