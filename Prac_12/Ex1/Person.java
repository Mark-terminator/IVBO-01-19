package Prac_12.Ex1;

public class Person {
    private String surname;
    private String name;
    private String patronymic;
    public Person(String surname, String name, String patronymic){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }
    public Person(String surname){
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public String get_Name() {
        if(name.equals(""))
            throw new IllegalArgumentException("");
        return name;
    }

    public String getPatronymic() throws IllegalArgumentException{
        if(patronymic.equals("")){
            throw new IllegalArgumentException("");
        }
        return patronymic;
    }
}
