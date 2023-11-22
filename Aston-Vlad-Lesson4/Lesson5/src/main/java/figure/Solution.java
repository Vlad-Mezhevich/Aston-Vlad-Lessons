package figure;

import animals.Animals;

public class Solution {

    public static void main(String[] args) {

        Figure[] figure = new Figure[4];
        figure[0] = new Circle(Color.Black, Color.Green, 5);
        figure[1] = new Triangle(Color.Green, Color.Green, 4,4,6);
        figure[2] = new Square(Color.Black, Color.Green,3);
        figure[3] = new Rectangle(Color.Black, Color.Green,4,7);
        for (Figure figures : figure) {
            System.out.println(figures);
        }

    }
}
