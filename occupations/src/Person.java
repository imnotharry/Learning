public class Person {
    private int age;
    private String name;
    private Gender gender;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce() {
        System.out.println("Hi, my name is " + name + ". I am " + age + ". I am a " + gender);
    }

    public void printGoal() {
        System.out.println("My goal is to be happy in the future.");
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }
}
