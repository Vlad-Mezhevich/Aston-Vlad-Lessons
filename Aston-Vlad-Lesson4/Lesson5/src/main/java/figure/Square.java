package figure;

public class Square extends Figure {

    private double side;

    public Square(Color background, Color border,double side) {
        super(FigureType.SQUARE, background, border);
        this.side=side;
    }

    @Override
    public double perimeter() {
        return 4*side;
    }

    @Override
    public double areа() {
        return side*side;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "Площадь: " + areа() +
                ", Периметр " + perimeter() +
                ", Цвет фона " + getBackground() +
                ", Цвет границы: " + getBorder() + "." +
                '}';
    }

}
