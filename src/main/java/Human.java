import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Human {
private String surname;
private String name;
private String patronymic;
private int age;
//2
public Human(String surname, String name, String patronymic, int age){
    if(surname == null){
        throw new IllegalArgumentException("Фамилия не введена");
    }
    this.surname = surname;
    if(name == null){
        throw new IllegalArgumentException("Имя не введено");
    }
    this.name = name;
    if(patronymic == null){
        throw new IllegalArgumentException("Отчество не введено");
    }
    this.patronymic = patronymic;
    if(age <=0){
        throw new IllegalArgumentException("Некорректный возраст");
    }
    this.age = age;
}

public Human(){

}

public String getName(){
    return name;
}

public void setName(String name){
    if(name == null){
        throw new IllegalArgumentException("Имя не введено");
    }
    this.name = name;
}

public String getSurname(){
    return surname;
}

public void setSurname(String surname){
    if(surname == null){
        throw new IllegalArgumentException("Фамилия не введена");
    }
    this.surname = surname;
}

public String getPatronymic(){
    return patronymic;
}

public void setPatronymic(String patronymic){
    if(patronymic == null){
        throw new IllegalArgumentException("Отчество не введено");
    }
    this.patronymic = patronymic;
}

public int getAge(){
    return age;
}

public void setAge(int age){
    if(age <=0){
        throw new IllegalArgumentException("Некорректный возраст");
    }
    this.age = age;
}

public List<Human> ListDemo(List<Human> list, Human human){
    List<Human> newList = new ArrayList<>();
    for(Human human1: list){
        if(human1.getSurname().compareToIgnoreCase(human.getSurname()) == 0){
            newList.add(human1);
        }
    }
    return newList;
}

//3
public List<Human> CopyList(List<Human> list, Human human){
    List<Human> newList = new ArrayList<>();
    for(Human human1: list){
        if(human1.getName().compareToIgnoreCase(human.getName()) != 0 || human1.getSurname().compareToIgnoreCase(human.getSurname()) != 0 || human1.getPatronymic().compareToIgnoreCase(human.getPatronymic()) != 0 || human1.getAge() != human.getAge()){
            newList.add(human1);
        }
    }
    return newList;
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(patronymic, human.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, patronymic, age);
    }


}
