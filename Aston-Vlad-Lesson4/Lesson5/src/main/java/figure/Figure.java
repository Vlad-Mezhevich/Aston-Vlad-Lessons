package figure;

public abstract class Figure implements Calculation {

    private FigureType figure;
    private Color background;
    private Color border;


    public Figure(FigureType figure, Color background, Color border) {
        this.figure = figure;
        this.background = background;
        this.border = border;
    }

    public FigureType getFigure() {
        return figure;
    }

    public Color getBackground() {
        return background;
    }

    public Color getBorder() {
        return border;
    }

}
