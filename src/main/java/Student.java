import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Student extends Human{
private String faculty;


//5
public Student(String faculty, Human human){
super(human.getName(), human.getSurname(), human.getPatronymic(), human.getAge());
if(faculty == null){
     throw new IllegalArgumentException("Факультет не введен");
 }
 this.faculty = faculty;
}

public String getFaculty(){
    return faculty;
}

public void setFaculty(String faculty){
    if(faculty == null){
        throw new IllegalArgumentException("Факультет не введен");
    }
    this.faculty = faculty;
}

}
