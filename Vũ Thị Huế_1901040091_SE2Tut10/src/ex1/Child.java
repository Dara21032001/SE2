package ex1;

public class Child extends Person{
    public Child( String name, int age){
        super(name, age);
    }
    @Override
    public void setAge(int age) throws IllegalArgumentException{
        if(age < 1 || age > 15){
            throw new IllegalArgumentException("Child's age must be less than 15!");
        }
        else
            super.setAge(age);
    }
}
