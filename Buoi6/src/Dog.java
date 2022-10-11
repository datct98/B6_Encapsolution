public class Dog extends Animal{
    @Override
    public void speak() {
        System.out.println("Dog 2 speak");
    }

    @Override
    public void eat() {
        super.eat();
    }

}
