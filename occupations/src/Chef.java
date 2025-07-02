public class Chef extends Person {


    public Chef(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    @Override
    public void introduce() {

        System.out.printf("Hi, my name is " + getName() + ". I am " + getAge() + ". I am a " + getGender() + " and a chef.");
    }

    public String cook(String food) {
        return getName() + " has cooked some " + food + ".";
    }
}