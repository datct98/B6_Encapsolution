public class Dog extends Animal{
    @Override
    public void speak() {
        System.out.println("Dog speak");
    }

    @Override
    public void eat() {
        super.eat();
    }

}
