public class ObjectArrayExample {
    public static void main(String[] args) {
      
        Person[] people = new Person[3];

       
        people[0] = new Person("Alice", 25);
        people[1] = new Person("Bob", 30);
        people[2] = new Person("Charlie", 35);

        
        for (int i = 0; i < people.length; i++) {
            System.out.println("이름: " + people[i].getName() + ", 나이: " + people[i].getAge());
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
