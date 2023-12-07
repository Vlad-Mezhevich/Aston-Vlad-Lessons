import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class Military {

    public static void main(String[] args) {
        Collection<Student> students = Arrays.asList(
                new Student("Дмитрий", 17, Student.Gender.MAN),
                new Student("Максим", 20, Student.Gender.MAN),
                new Student("Екатерина", 20, Student.Gender.WOMAN),
                new Student("Михаил", 28, Student.Gender.MAN)
        );
        // средний возраст студентов мужского пола
        double averageAgeMaleStudents = getAverageAgeMaleStudents(students);
        System.out.println("Средний возраст мужчин " + averageAgeMaleStudents);

        // студенты, которым грозит повестка
        Collection<String> conscriptStudents = getConscriptStudents(students);
        System.out.println("Повестка грозит " + conscriptStudents);
    }

    private static double getAverageAgeMaleStudents(Collection<Student> students) {
        long countMaleStudents = students.stream()
                .filter(student -> student.getGender() == Student.Gender.MAN)
                .count();
        if (countMaleStudents == 0) {
            return 0;
        }

        double sumAgeMaleStudents = students.stream()
                .filter(student -> student.getGender() == Student.Gender.MAN)
                .mapToInt(Student::getAge)
                .sum();
        return sumAgeMaleStudents / countMaleStudents;
    }

    private static Collection<String> getConscriptStudents(Collection<Student> students) {
        return students.stream()
                .filter(student -> student.getAge() >= 18 && student.getAge() <= 27 && student.getGender()
                        == Student.Gender.MAN)
                .map(Student::getName).collect(Collectors.toList());
    }

}
