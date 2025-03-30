package annotations;

public class Child extends Parent {


    @Override //makes sure the method is an override from the parent method
    public void someMethod() {
        System.out.println("Overriding method from the parent class");
    }
}
