package Figure;

import Custom_interface.Drawable;

public abstract class Figure implements Drawable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Figure(String name) {
        this.name = name;
    }
    public abstract Integer  calculatedPerimeter();

    @Override
    public abstract void  draw();
}
