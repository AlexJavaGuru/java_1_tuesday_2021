package student_josifs_makarenko.lesson_3.user;

    public class User {
        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        private String name;



    void greeting(){
        System.out.println("Hi " + getName() + "!");
    }
    void sayMyName(){
        System.out.println("Your name is " + getName());
    }
}
