public class Chef extends Person {
    public Chef() {
    }

    public Chef(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    @Override
    public void introduce() {
        // Using getters to access private fields
        System.out.println("Hi, my name is " + getName() + ". I am " + getAge() + ". I am a " + getGender() + " and a chef.");
    }

    public String cook(String food) {
        // Using getter to access private field
        return getName() + " has cooked some " + food + ".";
    }
}