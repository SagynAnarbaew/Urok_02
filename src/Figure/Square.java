package Figure;

public class Square extends Figure{

    private Integer side;


    public Square(String name, Integer side) {
        super(name);
        this.side = side;
    }

    @Override
    public Integer calculatedPerimeter(){
        return side* 4;
    }

    @Override
    public void draw() {
        System.out.println("⊡");


    }

}
