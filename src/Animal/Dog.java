package Animal;

public class Dog extends Animal implements SoundProducable{
    public Dog(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC15");
    }

    @Override
    public void callSound() {
        System.out.println("Гав Гав");
    }
}