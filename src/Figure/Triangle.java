package Figure;

public class Triangle extends Figure{


    private Integer sideA;
    private Integer sideB;
    private Integer sideC;

    public Triangle(String name, Integer sideA, Integer sideB, Integer sideC) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public Integer calculatedPerimeter(){
        return sideA + sideB + sideC;
    }

    @Override
    public void draw() {
        System.out.println("△");


    }
}


