public class Solution {

    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple(1.0f));
        appleBox1.addFruit(new Apple(1.0f));
        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange(1.5f));
        orangeBox.addFruit(new Orange(1.5f));
        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple(1.0f));
        // вес коробки с думя яблоками
        System.out.println("Вес appleBox1 " + appleBox1.getWeight());
        // вес коробки с двумя апельсинами
        System.out.println("Вес orangeBox " + orangeBox.getWeight());
        // результат сравнения двух коробок
        System.out.println("Коробки равны по весу? " + appleBox1.compare(orangeBox));
        appleBox1.transferFruitsToAnotherBox(appleBox2);
        // вес первой коробки яблок после пересыпки с нее
        System.out.println("Вес appleBox1 после передачи " + appleBox1.getWeight());
        // вес второй коробки яблок после пересыпки и добавления яблок
        System.out.println("Вес appleBox2 после передачи " + appleBox2.getWeight());
    }

}
