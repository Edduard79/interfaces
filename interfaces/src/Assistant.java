public class Assistant extends CollegePerson implements LearningPerson, TeachingPerson{

    public boolean isGoingToBeAPhD;

        public void studyAtHome(){
            System.out.println("Assistant " + this.surname + " " + this.name  + " is studying! ");
            System.out.println("Will " + this.name + " be a PhD? " + this.isGoingToBeAPhD);
        }

        public void teachToOtherPeople(){
            System.out.println(this.name + " " + this.surname + " helps other students! ");

        }

            public Assistant(String name, String surname, int id, boolean toBeAPhD ){
                this.name = name;
                this.surname = surname;
                this.collegeId = id;
                this.isGoingToBeAPhD = toBeAPhD;

            }




}
