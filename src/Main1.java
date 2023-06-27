public class Main1 {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("John Doe");
        person.setAge(30);
        System.out.println(person.getName());
        System.out.println(person.getAge());

        person.setName("Jane Smith");
        person.setAge(25);
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
