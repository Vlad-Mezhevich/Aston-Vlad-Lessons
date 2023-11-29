package figure;

public enum FigureType {

    CIRCLE("Окружность"),
    TRIANGLE("Треугольник"),
    RECTANGLE("Прямоугольник"),
    SQUARE("Квадрат");
    private String name;

    FigureType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
