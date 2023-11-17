public class Person {

    private String firstName;
    private String lastName;
    private String surName;
    private String postPerson;
    private String email;
    private Integer phoneNumber;
    private Double salary;
    private Integer agePerson;

    public Person(String firstName, String lastName, String surName, String postPerson, String email, Integer phoneNumber, Double salary, Integer agePerson) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.surName = surName;
        this.postPerson = postPerson;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.agePerson = agePerson;
    }

    public Integer getAgePerson() {
        return agePerson;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "={" +
                "ФИО:" + lastName +
                " " + firstName +
                " " + surName +
                "; Должность: " + postPerson +
                "; Почта: " + email +
                "; Номер телефона: " + phoneNumber +
                "; Зарплата: " + salary +
                "; Возраст: " + agePerson +
                '}';
    }

}
