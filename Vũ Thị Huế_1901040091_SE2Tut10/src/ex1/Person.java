package ex1;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
       this.setName(name);
       this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalArgumentException {
        if (name.length() < 3) {
            throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
        } else {
            this.name = name;
        }
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalArgumentException {
        if (age < 1) {
            throw new IllegalArgumentException("Age must be positive!");
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
       final StringBuilder sb = new StringBuilder();
       sb.append(String.format("name: %s, Age: %d", this.getName(), this.getAge()));
       return sb.toString();
    }
}
