public class Tester {

    public static void main(String[] args){

        Student student1 = new Student("Teodoro ", "Angiolini ", 72453, 1);
        Professor prof1 = new Professor("Marco Tullio ", "Cicerone ", 00102," Paleontology");
        Assistant assist1 = new Assistant("Claudia ","Anderson ",71928, true );

        student1.goToCollege();
        prof1.goToCollege();
        assist1.goToCollege();

        student1.studyAtHome();
        prof1.teachToOtherPeople();
        assist1.studyAtHome();
        assist1.teachToOtherPeople();


    }
}
