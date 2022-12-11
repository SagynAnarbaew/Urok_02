package Animal;

public class Cat extends  Animal  implements  SoundProducable{
    public Cat(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void draw() {

        System.out.println("\uD83D\uDC08");
    }
    @Override
    public void callSound() {
        System.out.println("Мяу Мяу");
    }
}
