class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        Person[] p = new Person[20];

        System.out.println(p[0]);

        p[0] = new Person("Mark", "Smith");
        p[1] = new Person("Paul", "Barne");

        System.out.println(p[0].getName());
    }
}
