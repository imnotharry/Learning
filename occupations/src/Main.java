public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Person person = new Person("Person" + i, 30 + i, Gender.MAN);
            person.introduce();
            person.printGoal();
        }

        for (int i = 0; i < 5; i++) {
            Chef chef = new Chef("Chef" + i, 35 + i, Gender.WOMAN);
            chef.introduce();
            System.out.println(chef.cook("pasta"));
        }
    }
}