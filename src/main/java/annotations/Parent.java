package annotations;

public class Parent {
    public void someMethod() {
        System.out.println("To be overwritten in child class...");
    }

    @Deprecated //Deprecated annotations warns devs using it that its deprecated
    public void otherMethod() {
        System.out.println("Doing old stuff...");
    }
}
