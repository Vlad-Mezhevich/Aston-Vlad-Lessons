public class Solution {

    public static void main(String[] args) {

        Person[] personArray = new Person[5];
        personArray[0] = new Person("Владислав", "Межевич", "Александрович", "Стажер", "bye@mail.ru", 999999999, 2000.5, 23);
        personArray[1] = new Person("Олег", "Монгол", "", "Джун", "bye@mail.ru", 999999999, 2000.5, 45);
        personArray[2] = new Person("Петя", "", "", "Стажер", "bye@mail.ru", 999999999, 2000.5, 35);
        personArray[3] = new Person("Саша", "", "", "Стажер", "bye@mail.ru", 999999999, 2000.5, 40);
        personArray[4] = new Person("Николай", "", "", "Стажер", "bye@mail.ru", 999999999, 2000.5, 41);
        for (int i = 0; i < personArray.length; i++) {
            if (personArray[i].getAgePerson() > 40) {
                System.out.println(personArray[i]);
            }
        }
        Park[] park = new Park[2];
        park[0] = new Park(Attractions.Slides, "8:30 - 20:00", 12.50);
        park[1] = new Park(Attractions.Сarousel, "8:30 - 20:00", 18.50);
        for (int i = 0; i < park.length; i++) {
            System.out.println(park[i]);
        }
    }

}
