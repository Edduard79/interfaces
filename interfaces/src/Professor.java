public class Professor extends CollegePerson implements TeachingPerson {

   public String teachingSubject;

        public void teachToOtherPeople(){
            System.out.println(this.name + this.surname + "teaches: " + this.teachingSubject );
        }

        public Professor(String name, String surname, int id, String subject){
            this.name = name;
            this.surname = surname;
            this.collegeId = id;
            this.teachingSubject = subject;
        }

}
