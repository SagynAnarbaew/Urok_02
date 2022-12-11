import Animal.Animal;
import Animal.Cat;
import Animal.Dog;
import Custom_interface.Drawable;
import Figure.*;
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle( "Ты круг: ", 15);
        Triangle triangle = new Triangle("Ты треугольник: ", 20, 30, 12);
        Rectangle rectangle = new Rectangle("Ты прямоугольник: ", 1, 5);
        Square square = new Square("Ты квадрат: ", 50);

        Dog dog = new Dog("Rex", 14);

        dog.callSound();

        Cat cat = new Cat("Marusya", 10);

        cat.callSound();

        Drawable[] drawables = { circle, triangle, rectangle, square, dog, cat};

        calculatedPerimeter(drawables);

    }

    private static void  calculatedPerimeter(Drawable[] figures){
        for (Drawable drawable : figures) {
            if (drawable instanceof Figure){
                System.out.println(((Figure) drawable).getName() + ((Figure) drawable).calculatedPerimeter());
            }
            if(drawable instanceof Animal){
                System.out.println(((Animal) drawable).getName() + "\n age: " + ((Animal) drawable).getAge());
            }
            drawable.draw();



        }
    }
}