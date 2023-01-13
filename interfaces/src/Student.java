import java.awt.image.PackedColorModel;

public class Student extends CollegePerson implements LearningPerson {
    public int academicYear;

    public void studyAtHome(){
        System.out.println(this.name + " " + this.surname + " is studying!");
    }

        public Student(String name, String surname,int id, int year){
            this.name = name;
            this.surname = surname;
            this.collegeId = id;
            this.academicYear = year;



    }




}
